type Action =
  | { type: 'products/add'; payload: { price: number, title: string, image: string } }
  | { type: 'products/delete'; payload: string }
  | { type: 'products/updatePriceAndTitle'; payload: { id: string, price: number, title: string } };
export default Action;
