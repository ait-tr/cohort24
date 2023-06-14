# Регистрация и логинизация с firebase

## Начальные данные
У вас есть проект в котором почти ничего нет, за исключением одного компонента `Profile.tsx`
и самого простого роутинга:

```
// src/components/App

import './App.css';
import { Route, Routes } from 'react-router-dom';
import Profile from '../components/Profile/Profile';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Profile />} />
    </Routes>
  );
}

export default App;
```

```
// src/components/Profile

import React from 'react';

function Profile():JSX.Element {
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email:</p>
        <span>Sign Out</span>
      </div>
    </div>
  );
}

export default Profile;
```
## Подготовка проекта

Первым делом следует установить Firebase Realtime Database  для этого выполним команду: `npm i firebase`.

После этого создаем в src папку api, в ней создаем файл firebase.ts

```
// src/api/firebase.ts
// eslint-disable-next-line import/no-extraneous-dependencies
import { initializeApp } from 'firebase/app';
// eslint-disable-next-line import/no-extraneous-dependencies
import { getAuth } from 'firebase/auth';

const firebaseConfig = {
  apiKey: 'нужно заменить',
  authDomain: 'нужно заменить',
  projectId: 'нужно заменить',
  storageBucket: 'нужно заменить',
  messagingSenderId: 'нужно заменить',
  appId: 'нужно заменить'
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export { app, auth };

```

Скопировали ключи.

## Регистрация пользователя
Создадим максимально простой компонент Register

```
// src/components/Register
import React, { useState } from 'react';


function Register():JSX.Element {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [error, setError] = useState('');
  return (
    <div>
      <div className="auth">
        <h1>Register</h1>
        {error && <div>{error}</div>}
        <form name="registration_form">
          <input
            type="email"
            value={email}
            placeholder="Enter your email"
            required
            onChange={(e) => setEmail(e.target.value)}
          />

          <input
            type="password"
            value={password}
            required
            placeholder="Enter your password"
            onChange={(e) => setPassword(e.target.value)}
          />

            <input
              type="password"
              value={confirmPassword}
              required
              placeholder="Confirm password"
              onChange={(e) => setConfirmPassword(e.target.value)}
            />
          <button type="submit">Register</button>
        </form>
        <span>
          Already have an account?
        </span>
      </div>
    </div>
  );
}

export default Register;
```
Добавим соответствующий путь в App:
```
function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Profile />} />
      <Route path="register" element={<Register />} />
    </Routes>
  );
}
```

### Валидация введенных данных
Для валидации введенных данных внутри компонента Register мы можем использовать функцию validatePassword
```
  const validatePassword = ():boolean => {
    let isValid = true;
    if (password !== '' && confirmPassword !== '') {
      if (password !== confirmPassword) {
        isValid = false;
        setError('Passwords does not match');
      }
    }
    return isValid;
  };
```
### Отправка данных
Для того, чтобы наши данные отправились на сервер, мы должны:
во-первых, подятнуть импорты в компоненте Register:
```
import { createUserWithEmailAndPassword } from 'firebase/auth';
import { auth } from '../../api/firebase';
```
Во-вторых, написать функцию register:
```
  const register = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    setError('');
    if (validatePassword()) {
      // Создаем нового пользователя с использованием полученных email и password
      createUserWithEmailAndPassword(auth, email, password)
        .then((res) => {
          console.log(res.user);
        })
        .catch((err) => setError(err.message));
    }
    setEmail('');
    setPassword('');
    setConfirmPassword('');
  };
```
Плюс внутри формы требуется обновить поле:
```
<form name="registration_form" onSubmit={register}>
```

Теперь, если вы введете данные, вы увидите, что создался пользователь и его можно посмотреть внутри интерфейса firebase в браузере.

Также если вы зайдете в консоль браузера, увидите, что в ответ нам пришел объект юзера UserImpl

## Контекст
Мы можем положить необходимые данные о юзере в контекст, чтобы эти данные были доступны в любых компонентах, обернутых в этот контекст. Давайте разберерем этот процесс поэтапно.

### Создание контекста
Чтобы создать контекст мы можем воспользоваться хуком createContext()
Создадим папку для контекстов, назовем ее contexts, внутри мы можем создать контекст для нашего пользователя: AuthContext.ts

```
import { User } from 'firebase/auth';
import { createContext } from 'react';

const AuthContext = createContext<User | undefined>(undefined);

export default AuthContext;

```
### Предоставление контекста
Для предоставления контекста, мы используем обертку AuthContext.Provider, в которую передаем значение пользователя.

`<AuthContext.Provider value={currentUser}>`

Ниже актуальное состояние App:
```
import React, { useEffect, useState } from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import { User, onAuthStateChanged } from 'firebase/auth';
import Profile from '../Profile/Profile';
import Register from '../Register/Register';
import { auth } from '../../api/firebase';
import AuthContext from '../../contexts/AuthContext';

function App(): JSX.Element {
  const [currentUser, setCurrentUser] = useState<User | null>(null);
  useEffect(() => {
    onAuthStateChanged(auth, (user) => {
      setCurrentUser(user);
      console.log(user);
    });
  }, []);
  return (
    // eslint-disable-next-line react/jsx-no-constructed-context-values
    <AuthContext.Provider value={currentUser}>
      <Routes>
        <Route path="/" element={<Profile />} />
        <Route path="register" element={<Register />} />
      </Routes>
    </AuthContext.Provider>
  );
}

export default App;

```
### Использование контекста
Чтобы получить необходимую информацию из контекса, мы должны воспользоваться хуком useContext.

Мы хотим получить информацию об email внутри компонента Profile:
```
import React, { useContext } from 'react';
import AuthContext from '../../contexts/AuthContext';

function Profile():JSX.Element {
  const user = useContext(AuthContext);
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email: {user?.email}</p>
        <span>Sign Out</span>
      </div>
    </div>
  );
}

export default Profile;

```



