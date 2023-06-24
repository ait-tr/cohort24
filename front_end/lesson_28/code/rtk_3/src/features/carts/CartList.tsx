import React, { useEffect, useState } from 'react';
import { useSelector } from 'react-redux';
import { useAppDispatch } from '../../store';
import { createCart, loadCarts } from './cartsSlice';
import OneCart from './OneCart';
import { selectCarts, selectError } from './selectors';

export default function CartList(): JSX.Element {
    const carts = useSelector(selectCarts);
    const error = useSelector(selectError);
    console.log(error);
    const [cartUserId, setCartUserId] = useState(0);
    const dispatch = useAppDispatch();

    useEffect(() => {
        dispatch(loadCarts());
    }, [dispatch]);

    const handleSubmitForm = React.useCallback(
        async (event: React.FormEvent) => {
            event.preventDefault();
            await dispatch(createCart({
                userId: cartUserId,
                date: new Date('2020-02-03'),
                products: [{ prodictId: 5, quantity: 1 }, { prodictId: 1, quantity: 5 }],
                __v: 0
            }));
        }, [dispatch, cartUserId]
    );
    const hanleCardUserIdChange = React.useCallback(
        (event: React.ChangeEvent<HTMLInputElement>) => {
        setCartUserId(event.target.valueAsNumber);
    }, []);

    return (
        <>
        <form onSubmit={handleSubmitForm}>
            <div>
                <input value={cartUserId} type="number" onChange={hanleCardUserIdChange} />
                <button type="submit">Ok</button>
            </div>
        </form>
        <div>
            {carts.map((cart) => (
                <OneCart
                  key={cart.id}
                  cart={cart}
                />
            ))}
        </div>
        </>
    );
}
