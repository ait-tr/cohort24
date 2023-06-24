import React, { useEffect } from 'react';
import { useSelector } from 'react-redux';
import { selectProduct } from './selectors';
import { useAppDispatch } from '../../store';
import { deleteProduct, loadProducts } from './productsSlice';

export default function Products(): JSX.Element {
  // state.products.products - стейт - имя фичи или централизованного состояния - ключ
  const products = useSelector(selectProduct);
  const dispatch = useAppDispatch();

  useEffect(() => {
    dispatch(loadProducts());
  }, [dispatch]);

  return (
    <>
      <h2>Добавление продуктов</h2>
      {/* получить в форме информацию */}
      {/* вызвать диспачт и передать соответвующую информацию */}
      {/* посмотрите как мы работали с формами в firebase */}
      <div>Products</div>
      <ul>
        {products.map((el) => (
          <li key={el.id}>
            {el.title}
            <br />
            {el.description}
            <button
              type="button"
              onClick={() => dispatch(deleteProduct(el.id))}
            >Delete
            </button>
          </li>
        )
        )}
      </ul>
    </>
  );
}
