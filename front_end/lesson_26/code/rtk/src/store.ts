import { configureStore } from "@reduxjs/toolkit";
import { useDispatch } from "react-redux";
import authReducer from "./features/auth/authSlice";
import counterReducer from "./features/counter/counterSlice";

const store = configureStore({
    reducer: {
      counter: counterReducer,
      auth: authReducer
    }
})

export default store

export type RootState = ReturnType<typeof store.getState>

// для правильной типизации будем использовать useAppDispatch() вместо useDispatch
export type AppDispatch = typeof store.dispatch;
export const useAppDispatch: () => AppDispatch = useDispatch