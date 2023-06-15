// eslint-disable-next-line import/no-extraneous-dependencies
import { User } from 'firebase/auth';
import { createContext } from 'react';

const AuthContext = createContext<User | null>(null);

export default AuthContext;
