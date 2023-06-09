import Action from "./types/Action";
import AuthState from "./types/AuthState";

const initialValue: AuthState = {}

export default function authReducer(state: AuthState = initialValue, action: Action): AuthState {
    switch (action.type) {
        case "auth/saveLogin":
            return {...state, login: action.payload}
            default: return state
    }
    // return state
}