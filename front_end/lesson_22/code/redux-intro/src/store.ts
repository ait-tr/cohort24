import { combineReducers, createStore } from "redux";
import authReducer from "./features/auth/authReducer";
import counterReducer from "./features/counter/counterReducer";

const store = createStore(combineReducers({
    counter: counterReducer,
    auth: authReducer
}, )) 

export default store

export type RootState = ReturnType<typeof store.getState>