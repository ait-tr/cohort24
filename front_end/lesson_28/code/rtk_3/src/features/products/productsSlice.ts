/* eslint-disable import/prefer-default-export */
import { createAsyncThunk, createSlice } from '@reduxjs/toolkit';
import type ProductsState from './types/ProductsState';
import * as api from './api';
import ProductDto from './types/ProductDto';

// описываем начальное состояние
const initialState: ProductsState = {
  products: [],
  error: undefined
};

// CRUD - create, read, update, delete
// cоздаем thunk
export const loadProducts = createAsyncThunk(
  'products/loadProducts',
  () => api.getAllProducts()
);

// thunk для удаления
export const deleteProduct = createAsyncThunk(
  'products/deleteProduct',
  (id: number) => api.deleteProduct(id)
);

// thunk для создания
export const createProduct = createAsyncThunk(
  'products/createProduct',
  (product: ProductDto) => api.createProduct(product)
);

// создаем слайс
const productsSlice = createSlice({
  name: 'products',
  initialState,
  reducers: {
    resetError: (state) => {
      state.error = undefined;
    }
  },
  extraReducers: (builder) => {
    builder
      .addCase(loadProducts.fulfilled, (state, action) => {
        // в action.payload придет результат из thunk
        state.products = action.payload;
      })
      .addCase(loadProducts.rejected, (state) => {
        state.error = 'Error: products fetch rejected';
      })
      // вариант удаления с деструктуризацией
      // .addCase(deleteProduct.fulfilled, (state, { payload }) => {
      //   // в action.payload придет результат из thunk
      //   state.products =
      //     state.products.filter(({ id }) => id !== payload.id);
      // })
      // старый вариант удаления без деструктуризации
      .addCase(deleteProduct.fulfilled, (state, action) => {
        // в action.payload придет результат из thunk
        state.products =
          state.products.filter((product) => product.id !== action.payload.id);
      })
      .addCase(deleteProduct.rejected, (state) => {
        // в action.payload придет результат из thunk
        state.error = 'Error, delete rejected by server';
      })
      .addCase(createProduct.fulfilled, (state, action) => {
        // в action.payload придет результат из thunk
        // здесь можно мутировать в отличие от чистого редакса
        state.products.push(action.payload);
      });
  }
});

export const { resetError } = productsSlice.actions;
export default productsSlice.reducer;
