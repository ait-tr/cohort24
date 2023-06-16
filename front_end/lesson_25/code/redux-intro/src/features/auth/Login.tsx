import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import Action from './types/Action';

export default function Login(): JSX.Element {
    const dispatch = useDispatch();
    const [login, setLogin] = useState('');

    const handleSubmit = (event: React.FormEvent): void => {
        event.preventDefault();
        dispatch<Action>({ type: 'auth/saveLogin', payload: login });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input
              value={login}
              placeholder="Enter your login"
              onChange={(e) => setLogin(e.target.value)}
            />
            <button type="submit">Ok</button>
        </form>
    );
}
