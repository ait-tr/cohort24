import Cart from './Cart';

export default interface CartState {
    carts: Cart[],
    error?: string
}
