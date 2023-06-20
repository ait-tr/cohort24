import { createSlice, PayloadAction } from "@reduxjs/toolkit";
import AuthState from "./types/AuthState";

const initialState: AuthState = {};


const authSlice = createSlice({
    name: 'auth',
    initialState,
    reducers: {
        saveLogin: (state, action: PayloadAction<string>) => {
            state.login = action.payload
        }
    }
});

export const { saveLogin } = authSlice.actions;

export default authSlice.reducer