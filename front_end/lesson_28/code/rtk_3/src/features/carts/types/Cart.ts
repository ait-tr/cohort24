import CartProduct from './CartProduct';

export default interface Cart {
    id: number,
    userId: number,
    date: Date,
    products: CartProduct[],
    __v: number
}

export type CartId = Cart['id'];

export type NewCart = {
    userId: number,
    date: Date,
    products: CartProduct[],
    __v: number
};
