import Action from './types/Action';
import CounterState from './types/CounterState';

const initialState: CounterState = {
    value: 0,
};

export default function counterReducer(
    state: CounterState = initialState, action: Action): CounterState {
    switch (action.type) {
        case 'counter/minus':
            return { ...state, value: state.value - action.payload };
        case 'counter/plus':
            return { ...state, value: state.value + action.payload };
            // возвращаем state, если экшн из другого раздела или просто не тот экшн
        default: return state;
    }
    // можно написать и таким образом
    // return state
}
