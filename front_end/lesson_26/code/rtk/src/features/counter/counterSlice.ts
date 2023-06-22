// slice = ActionType + actionCreators + reducer

import { createAsyncThunk, createSlice, PayloadAction } from "@reduxjs/toolkit";
import Color from "./types/Color";
import CounterState from "./types/CounterState";
import * as api from './api'

const initialState: CounterState = {
    value: 0,
    color: "red"
}

// асинхронный action creator
// мы кидаем fetch
export const changeColor = createAsyncThunk(
    'counter/changeColor',
    async (color: Color) => {
        await api.colorChange(color);
        // этот результат уйдет в редьюсер
        return color;
    }
)

export const saveCounterValue = createAsyncThunk(
    'counter/saveValue',
    async (value: number) => {
        await api.save(value);
        // возвращает те данные, которые нужны, чтобы поменять стэйт
        // return value
    }
)

const counterSlice = createSlice({
    name: "counter",
    initialState,
    reducers: {
        minus(state, action: PayloadAction<number>) {
            state.value -= action.payload
        },
        plus(state, action: PayloadAction<number>) {
            state.value += action.payload
        },
    },
    extraReducers: (builder) => {
        builder.addCase(changeColor.fulfilled, (state, action) => {
            // в action.payload придет результат из thunk
            const color = action.payload;
            state.color = color
        })
        // поскольку стэйт менять не нужно, то мы просто отправляем thunk, а в extraReducers ничего не добавляем
        // .addCase(
        //     saveCounterValue.fulfilled, (state, action) => {
        //         state.value = action.payload;
        //     }
        // )
    }
});

export const { minus, plus } = counterSlice.actions;

export default counterSlice.reducer
