import { createAsyncThunk, createSlice } from '@reduxjs/toolkit';
import CartState from './types/CartState';
import * as api from './api';
import Cart, { CartId, NewCart } from './types/Cart';

const initialState: CartState = {
    carts: [],
    error: ''
};

export const loadCarts = createAsyncThunk('carts/loadCarts', () => {
    console.log('success');
    return api.getAllCarts();
});

export const deleteCart = createAsyncThunk('carts/deleteCart',
    async (id: CartId) => {
        await api.deleteCart(id);
        return id;
    }
);

export const createCart = createAsyncThunk('carts/createCart',
async (cart: NewCart) => {
    if (!cart.userId) {
      throw new Error('userId не должен быть пустым');
    }

    return api.createCart(cart);
  }
);

export const updateCart = createAsyncThunk('carts/updateCart',
 async (cart: Cart) => {
    await api.updateCart(cart);
    return cart;
 }
);

const cartSlice = createSlice({
    name: 'carts',
    initialState,
    reducers: {},
    extraReducers: (builder) => {
        builder
        .addCase(loadCarts.fulfilled, (state, action) => {
            state.carts = action.payload;
        })
        .addCase(deleteCart.fulfilled, (state, action) => {
            state.carts = state.carts.filter((cart) => cart.id !== action.payload);
        })
        .addCase(deleteCart.rejected, (state) => {
            state.error = 'ERROOOOOOR';
        })
        .addCase(createCart.fulfilled, (state, action) => {
            state.carts.push(action.payload);
        })
        .addCase(updateCart.fulfilled, (state, action) => {
            state.carts = state.carts.map(
                (cart) => cart.id === action.payload.id ? action.payload : cart);
        });
    }
});

export default cartSlice.reducer;
