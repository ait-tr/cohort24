### Реализовать endpoint для добавления пользователей

* Пример запроса:

```
POST /api/users
```

* Пример тела запроса:

```json
{
  "email": "sidikov.m@gmail.com",
  "password": "qwerty",
  "firstName": "Marsel",
  "lastName": "Sidikov"
}
```

* Пример тела ответа:
    * `201 CREATED`

```json
{
  "id" : 1,
  "firstName" : "Marsel",
  "lastName": "Sidikov",
  "email": "sidikov.m@gmail.com"
}
```

* При создании пользователя по умолчанию его роль `USER`
* При создании пользователя по умолчанию его состояние `NOT_CONFIRMED`
* Необходимо также хранить время/дату регистрации пользователя

### Список ролей и состояний

* Роли
  * `USER` - обычный пользователь
  * `MANAGER` - менеджер
  * `ADMIN` - главный администратор
* Состояния
  * `NOT_CONFIRMED` - не подтвердил свою почту
  * `CONFIRMED` - подтвердил свою почту
  * `BANNED` - пользователя забанили
  * `DELETED` - пользователь удален

### Реализовать endpoint для получения пользователей

* Пример запроса

```
GET /api/users
```

* Пример ответа:
  * 200 OK

```json
{
  "users" : [
    {
      "id" : 1,
      "firstName" : "Marsel",
      "lastName": "Sidikov",
      "email": "sidikov.m@gmail.com"
    },
    {
      "id" : 1,
      "firstName" : "Marsel",
      "lastName": "Sidikov",
      "email": "sidikov.m@gmail.com"
    },
    {
      "id" : 1,
      "firstName" : "Marsel",
      "lastName": "Sidikov",
      "email": "sidikov.m@gmail.com"
    }
  ]
}
```