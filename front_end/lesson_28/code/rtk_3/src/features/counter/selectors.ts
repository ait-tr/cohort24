import { RootState } from '../../store';
import Color from './types/Color';

export const selectCounterValue = (
    state: RootState
    ): number => state.counter.value;

export const selectColor = (
    state: RootState
): Color => state.counter.color;
