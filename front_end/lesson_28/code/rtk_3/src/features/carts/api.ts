import Cart, { CartId, NewCart } from './types/Cart';

// eslint-disable-next-line import/prefer-default-export
export async function getAllCarts(): Promise<Cart[]> {
    const result = await fetch('https://fakestoreapi.com/carts?limit=8');
    // console.log(result.json());
    return result.json();
}

export async function deleteCart(id: CartId): Promise<void> {
    await fetch(`https://fakestoreapi.com/carts/${id}`, {
        method: 'DELETE',
    });
}

export async function createCart(cart: NewCart): Promise<Cart> {
   const result = await fetch('https://fakestoreapi.com/carts', {
        method: 'POST',
        body: JSON.stringify(cart),
        headers: {
            'Content-type': 'application/json'
        }
    });
    return result.json();
}

export async function updateCart(cart: Cart): Promise<void> {
    await fetch('https://fakestoreapi.com/carts/7', {
        method: 'PUT',
        body: JSON.stringify(cart),
        headers: {
            'Content-type': 'application/json'
        }
    });
}
