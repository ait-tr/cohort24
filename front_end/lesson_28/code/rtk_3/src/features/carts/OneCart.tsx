import React, { useState } from 'react';
import { useAppDispatch } from '../../store';
import { deleteCart, updateCart } from './cartsSlice';
import Cart from './types/Cart';

export default function OneCart({ cart }: { cart: Cart }): JSX.Element {
    const dispatch = useAppDispatch();
    const [value, setNewValue] = useState(cart.userId);
    const [form, setForm] = useState(false);

    const haldleValueChange = React.useCallback(
        async (event: React.FormEvent<HTMLFormElement>) => {
             event.preventDefault();
             await dispatch(updateCart({
                 ...cart, userId: value
             }));
             setForm(false);
         }, [dispatch, value, cart]);
    return (
        <div>
            {!form
             ?
            (<span>{cart.userId}</span>)
             : (
             <form onSubmit={haldleValueChange}>
                <input defaultValue={cart.userId} type="number" value={value} onChange={(event) => setNewValue(event?.target.valueAsNumber)} />
                 <button type="submit">save changes</button>
             </form>
             )}
             <br />
             <button type="submit" onClick={() => dispatch(deleteCart(cart.id))}>delete</button>
             <button type="submit" onClick={() => setForm(true)}>change cart</button>
        </div>
         );
}
