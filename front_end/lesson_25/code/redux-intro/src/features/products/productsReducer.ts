import uniqid from 'uniqid';
import Action from './types/Action';
import Product from './types/Product';

const initialState: Product[] = [
  {
    id: uniqid(),
    title: 'Cheesecake',
    image: 'https://loremflickr.com/cache/resized/3061_2772510173_99439be815_c_640_480_nofilter.jpg',
    price: 2
  }
];

export default function productsReducer(
  state: Product[] = initialState, action: Action): Product[] {
  switch (action.type) {
    case 'products/add':
      return [...state, {
        id: uniqid(),
        ...action.payload // взяли все ключи от payload:
        // title: action.payload.title,
        // price: action.payload.price,
        // image: action.payload.image
      }];
    case 'products/delete':
      return state.filter((product) => product.id !== action.payload);
    case 'products/updatePriceAndTitle':
      return state.map((product) => {
        if (product.id === action.payload.id) {
          return {
            ...product,
            title: action.payload.title, // можно тоже заменить на spread
            price: action.payload.price
          };
        }
        return product;
      });
    default: return state;
  }
}
