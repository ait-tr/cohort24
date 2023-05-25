const obj = {
  products: [
    { title: "bottle of wine", price: 35, category: "wines" },
    { title: "1984", price: 15, category: "books", author: "George Orwell" },
    { title: "Iphone XR", price: 400, category: "phones", campera: "12MP" }
  ]
};

// ver 1 destructuring assignment
// const {products} = obj;
// const [,book] = products;
// const {author} = book;
// console.log(author);

// ver 2 
const { products: [, { author }] } = obj;
console.log(author);

