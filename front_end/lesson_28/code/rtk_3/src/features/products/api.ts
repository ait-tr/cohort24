import Product from './types/Product';
import ProductDto from './types/ProductDto';

// eslint-disable-next-line import/prefer-default-export
export async function getAllProducts(): Promise<Product[]> {
  const res = await fetch('https://fakestoreapi.com/products');
  return res.json();
}

// методы
// GET - получение
// DELETE - удаления
// POST - для создания
// PUT - изменить объект целиком

// PATCH - изменить часть объекта

export async function deleteProduct(id: number): Promise<Product> {
  const res = await fetch(`https://fakestoreapi.com/products/${id}`, {
    method: 'DELETE'
  });
  return res.json();
}

export async function createProduct(product: ProductDto): Promise<Product> {
  const res = await fetch('https://fakestoreapi.com/products', {
    method: 'POST',
    body: JSON.stringify(
      {
        title: product.title,
        price: product.price,
        description: product.description,
        image: product.image,
        category: product.category
      }
    )
  });
  const { id } = await res.json();
  return { ...product, id };
}
