// У вас есть массив объектов:

const cars = [
    { brand: "BMW", price: 20000, isDiesel: true },
    { brand: "Mercedes", price: 22000, isDiesel: false },
    { brand: "Porshe", price: 50000, isDiesel: true },
    { brand: "Nissan", price: 25000, isDiesel: false },
];

// Задание1
// Создайте на основе страрого массива новый массив объектов по образу:
// [{brand: "BMW", isDiesel: true}, {brand: "Mercedes", isDiesel: false}...]
const cars2 = cars.map((car) => {
    return {brand: car.brand, isDiesel: car.isDiesel}
})

// console.log(cars2);
// console.log(cars);
