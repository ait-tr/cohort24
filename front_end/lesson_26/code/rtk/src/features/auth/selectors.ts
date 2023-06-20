import { RootState } from "../../store";

export const selectLogin = (
    state: RootState
): string | undefined => state.auth.login