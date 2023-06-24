import { RootState } from '../../store';
import Cart from './types/Cart';

// eslint-disable-next-line import/prefer-default-export
export const selectCarts = (state: RootState): Cart[] => state.carts.carts;
export const selectError = (state: RootState): string | undefined => state.carts.error;
