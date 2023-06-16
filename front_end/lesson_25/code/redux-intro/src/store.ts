import { combineReducers, createStore } from 'redux';
import authReducer from './features/auth/authReducer';
import counterReducer from './features/counter/counterReducer';
import tasksReducer from './features/tasks/tasksReducer';
import productsReducer from './features/products/productsReducer';

const store = createStore(combineReducers({
    counter: counterReducer,
    auth: authReducer,
    tasks: tasksReducer,
    products: productsReducer
},));

export default store;

export type RootState = ReturnType<typeof store.getState>;
