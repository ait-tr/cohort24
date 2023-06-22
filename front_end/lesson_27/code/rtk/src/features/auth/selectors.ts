import { RootState } from '../../store';

// eslint-disable-next-line import/prefer-default-export
export const selectLogin = (state: RootState): string | undefined => state.auth.login;
