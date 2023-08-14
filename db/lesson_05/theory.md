## Базовые термины

- **рефакторинг (кода)** - перевыпуск (переработка) кода
- **стек (программный)** - набор технологий (инструментов) для создания проекта
- **проект** - кодовая база (как пример)
- **алгоритм** - идея (способ) решения
- **программа** - реализация алгоритма

**Примеры запросов** 

```sql
SELECT *
FROM Customers
WHERE
	Country IN ('Germany', 'USA')
	-- Country='Germany'
	-- OR
	-- Country='USA'
```

```sql
-- Вывести ТОП-1 компанию-перевозчик (и ко-во заказов) по количеству доставок
SELECT
		Shippers.ShipperName,
    COUNT(*) AS total_orders
FROM Orders

JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID

GROUP BY Orders.ShipperID

ORDER BY total_orders DESC
LIMIT 1
```

```sql
-- Вывести ТОП-3 самых продаваемых товаров (проекция: название_товара, ко_во_продаж)
SELECT
	Products.ProductName,
	SUM(OrderDetails.Quantity) AS sold_count
	
FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.ProductID

ORDER BY sold_count DESC
LIMIT 3
```

```sql
-- Вывести название и стоимость в USD одного самого дорогого проданного товара
SELECT
		Products.ProductName,
    Products.Price * 1.1 AS Price_usd

FROM OrderDetails
JOIN Products ON OrderDetails.ProductID=Products.ProductID

ORDER BY Products.Price DESC
LIMIT 1
```

```sql
-- Вывести список стран, которые поставляют морепродукты
SELECT DISTINCT
	Suppliers.Country

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Seafood'
```

```sql
-- Вывести сумму проданного товара в `USA`
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS total_sold_to_usa

FROM OrderDetails

JOIN Orders ON OrderDetails.OrderID=Orders.OrderID
JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE
	Customers.Country='USA'
```

```sql
-- Вывести стоимость заказов от 5000 EUR в упорядоченном виде
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.OrderID

HAVING order_cost >= 5000

ORDER BY order_cost DESC
```

```sql
-- Вывести ТОП-2 поставщиков, которые привезли больше всего товаров
SELECT
	Suppliers.SupplierName,
	COUNT(*) AS total_products

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

GROUP BY Products.SupplierID

ORDER BY total_products DESC
LIMIT 2
```

## Масштабирование (проекта)

- увеличение выч/мощностей по мере увеличения роста нагрузки

**Виды**

- вертикальное (качество)
- горизонтальное (количество)

## MongoDB: документо-ориентированная (документная) СУБД

### **Принципиальные отличия MongoDB от RDBMS**

1. используется собственный язык запросов (NoSQL -`Query API`)
2. документная модель данных (не табличная)
3. динамическая схема данных (без схемы, `schemaless`) - каждый документ может содержать свой набор полей
4. для хранения используется `JSON` и `Binary JSON` (`BSON`)
5. позволяет хранить вложенные структуры данных
6. имеет встроенную поддержку масштабирования

## MongoDB: CRUD

**Create**

- `insertOne()` добавить один документ
    - один аргумент
        - ассоц/массив (объект)
- `insertMany()` добавить несколько документов
    - один аргумент
        - массив ассоц/массивов

**Read**

- `findOne()` найти (выбрать) один документ
- `find()` найти (выбрать) несколько документов
    - аргументы
        - `filter`
        - `projection`
- `countDocuments()` ко-во совпадений
    - аргументы
        - `filter`

**Update**

- `updateOne()` изменить один документ
- `updateMany()` изменить несколько документов
    - аргументы
        - `filter`
        - `action`

**Delete**

- `deleteOne()` удалить один документ
- `deleteMany()` удалить несколько документов
    - аргументы
        - `filter`

![Screenshot from 2023-08-14 20-40-37.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df1d9156-132c-4fff-b63b-89343788793e/Screenshot_from_2023-08-14_20-40-37.png)

## Базовые структуры данных

1. Скаляр (скалярное значение)
2. Массив (список значений)
3. Ассоц/массив (карта, пары ключ-значение)
4. Множеств (список **уникальных** значений)

**Пример. Добавить несколько юзеров**

```jsx
db.users.insertMany([
    {_id: 1, fullname: 'Ivan Ivanov', country: 'Germany'},
    {_id: 2, fullname: 'Petr Petrov', country: 'USA'},
    {_id: 3, fullname: 'Sidr Sidorov', country: 'France'}
])
```

**Пример. Добавить несколько товаров**

```jsx
db.products.insertMany([
    { _id: 1, title: 'Product 1', price: 100 },
    { _id: 2, title: 'Product 2', price: 200 },
    { _id: 3, title: 'Product 3', price: 300 }
])
```

**Пример. Вывести всех юзеров**

```jsx
db.users.find()
```

**Пример. Вывести юзеров из `USA`**

```jsx
db.users.find(
    { country: 'USA' } // filter
)
```

**Пример. Вывести имена юзеров из `USA`**

```jsx
db.users.find(
    { country: 'USA' }, // filter
    { fullname: 1, _id: 0 } // projection
)
```

**Пример. Вывести имена всех юзеров**

```jsx
db.users.find(
    {}, // filter
    { fullname: 1, _id: 0 } // projection
)
```

**Пример. Вывести имя юзера `1`**

```jsx
db.users.findOne(
    { _id: 1 }, // filter
    { fullname: 1, _id: 0 } // projection
)
```

## Основные операторы модификации

- `$set` установить поля
- `$unset` удалить (снять) поля
- `$inc` инкремент значений
- `$mul` умножение
- `$push` добавить элементы в массив
- `$addToSet` добавить элементы в множество
- `$pull` удалить элементы из массива
- `$pullAll` удалить несколько элементов из массива
- `$each` (используется в связке c `$push` и `$addToSet`)

**Пример. Заблокировать юзера `1`**

```jsx
db.users.updateOne(
    { _id: 1 }, // filter
    { $set: { is_blocked: true } } // action
)
```

**Пример. Вывести заблокированных юзеров**

```jsx
db.users.find(
    { is_blocked: true } // filter
)
```

## Операторы сравнения

`$eq` равно (equal)

`$ne` не равно (not equal)

`$gt` больше (greater than)

`$gte` больше или равно (greater than or equal)

`$lt` меньше (less than)

`$lte` меньше или равно (less than or equal)

**Пример. Вывести незаблокированных юзеров**

```jsx
db.users.find(
    { is_blocked: { $ne: true } } // filter
)
```

**Задача. Вывести имена юзеров из `USA`**

```jsx
db.users.find(
    { country: 'USA' },
    { fullname: 1, _id: 0 }
)
```

**Задача. Вывести имена незаблокированных юзеров**

```jsx
db.users.find(
    { is_blocked: { $ne: true } },
    { fullname: 1, _id: 0 }
)
```

**Задача. Вывести названия всех товаров**

```jsx
db.products.find(
    {},
    { title: 1, _id: 0 }
)
```

**Задача. Вывести товары с ценой до `1000` EUR**

```jsx
db.products.find(
    { price: { $lte: 1000 } } // filter
)
```

**Задача. Вывести названия и стоимость товаров от `50` EUR**

```jsx
db.products.find(
    { price: { $gte: 50 } },
    { _id: 0 }
)
```

**Задача. Вывести товары с ценой от `50` до `500` EUR**

```jsx
db.products.find(
    { price: { $gte: 50, $lte: 500 } }
)
```

**Пример. Увеличить стоимость товара `1` на `25` EUR**

```jsx
db.products.updateOne(
    { _id: 1 }, // filter
    { $inc: { price: 25 } } // action
)
```

**Пример. Применить скидку `15%` ко всем товарам**

```jsx
db.products.updateMany(
    {}, // filter
    { $mul: { price: .85 } } // action
)
```

**Задача. Увеличить стоимость на `0.5%` для товаров с ценой от `10` до `300` EUR**

```jsx
db.products.updateMany(
    { price: { $gte: 10, $lte: 300 } }, // filter
    { $mul: { price: 1.005 } } // action
)
```

**Задача. Разблокировать всех юзеров, кроме тех, что из `Italy`**

```jsx
// вар. 1
db.users.updateMany(
    { country: { $ne: 'Italy' } }, // filter
    { $unset: { is_blocked: null } } // action
)

// вар. 2
db.users.updateMany(
    { country: { $ne: 'Italy' } }, // filter
    { $set: { is_blocked: false } } // action
)
```