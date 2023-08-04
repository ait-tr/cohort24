## Ссылки

- [пример БД “соц/сеть”](https://dbdiagram.io/d/64cd444902bd1c4a5e44615d)

**Задача. Вывести название и стоимость в `USD` одного самого дорогого проданного товара**

```sql
SELECT
		Products.ProductName,
    Products.Price * 1.1 AS Price_usd

FROM OrderDetails
JOIN Products ON OrderDetails.ProductID=Products.ProductID

ORDER BY Products.Price DESC
LIMIT 1
```

**Задача. Вывести два самых дорогих товара из категории `Beverages` из `USA`**

```sql
SELECT *
FROM Products

JOIN Categories ON Products.CategoryID=Categories.CategoryID
JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

WHERE
	Categories.CategoryName LIKE 'beverages'
	AND
	Suppliers.Country LIKE 'usa'

ORDER BY Products.Price DESC
LIMIT 2
```

## Ключевые поля в БД

- **первичный ключ** - уникальный номер каждой сущности (объекта)
- **внешний ключ** - поля для связи между таблицами

**Задача. Вывести название и стоимость одного самого дешевого товара из категорий `2, 4, 8`**

```sql
SELECT
    ProductName,
    Price
FROM Products

WHERE
    CategoryID IN (2, 4, 8)

ORDER BY Price ASC
LIMIT 1
```

**Задача. Удалить товары с ценой от `50` до `150` EUR**

```sql
DELETE FROM Products
WHERE
	Price BETWEEN 50 AND 150
```

## Агрегация данных в SQL

**Базовые категории запросов**

1. **CRUD** - более простые запросы
2. **Aggregation** - получение вычисленных данных (итоги, статистика, аналитика

**Базовые операторы агрегации**

- `COUNT()` расчет ко-ва строк
- `AVG()` расчет сред/ариф. знач.
- `MAX()` расчет макс. значения
- `MIN()` расчет мин. значения
- `SUM()` расчет суммы

**Пример. Найти ко-во клиентов**

```sql
-- общее
SELECT
	COUNT(*) AS total_customers
FROM Customers

-- из Germany
SELECT
	COUNT(*) AS total_customers
FROM Customers
WHERE
	Country='Germany'
```

**Пример. Найти среднюю стоимость товаров**

```sql
SELECT
	AVG(Price) AS avg_price
FROM Products
```

**Пример. Вывести статистику по товарам**

```sql
SELECT
	AVG(Price) AS avg_price,
	MIN(Price) AS min_price,
	MAX(Price) AS max_price,
	SUM(Price) AS total_price,
	COUNT(*) AS total_products
FROM Products
```

**Задача. Вывести ко-во поставщиков из `USA`**

```sql
SELECT
	COUNT(*) AS usa_suppliers
FROM Suppliers

WHERE
	Country='USA'
```

**Задача. Вывести ко-во поставщиков из `USA, UK, Japan`**

```sql
SELECT
	COUNT(*) AS total_suppliers
FROM Suppliers

WHERE
	Country IN ('USA', 'UK', 'Japan')
```

**Задача. Вывести среднюю стоимость товаров с ценой до `150` EUR**

```sql
SELECT
	AVG(Price) AS avg_price
FROM Products

WHERE
	Price <= 150
```

**Задача. Вывести MAX-стоимость товаров с ценой от `20` до `200` EUR из категории `4`**

```sql
SELECT
	MAX(Price) AS max_price
FROM Products

WHERE
		Price BETWEEN 20 AND 200
    AND
    CategoryID=4
```

**Задача. Вывести ко-во поставщиков не из `USA` и не из `Spain`**

```sql
SELECT
	COUNT(*) AS total_not_usa_spain_suppliers
FROM Suppliers

WHERE
	NOT Country IN ('USA', 'Spain')
```

**Задача. Вывести сред/стоимость товаров из категорий `1, 2, 5`, у которых название начинается с `t`**

```sql
SELECT
	AVG(Price) AS avg_price
FROM Products

WHERE
	CategoryID IN (1, 2, 5)
	AND
	ProductName LIKE 't%'
```

**Задача. Найти, сколько раз был продан (заказан) товар `11`**

```sql
SELECT
	COUNT(*) AS total_sold
FROM OrderDetails
WHERE
	ProductID=11
```

**Задача. Посчитать стоимость заказа `10248`**

```sql
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS order_cost
FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE
	OrderDetails.OrderID=10248
```

**Задача. Вывести `ко-во заказов`, которое оформил клиент `1`**

```sql
SELECT
	COUNT(*) AS total_orders
FROM Orders

WHERE
	CustomerID=1
```

**Задача. Вывести среднюю стоимость напитка из `USA`**

```sql
SELECT 
	AVG(Products.Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Beverages'
	AND
	Suppliers.Country='USA'
```

**Задача. На какую сумму было отправлено товаров клиентам из `USA`**

```sql
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS total_sold_to_usa

FROM OrderDetails

JOIN Orders ON OrderDetails.OrderID=Orders.OrderID
JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE
	Customers.Country='USA'
```

**Задача. Вывести ко-во заказов, которое компания `Speedy Express` доставила в `Brazil`**

```sql
SELECT
	COUNT(*) AS total_shipped_to_brazil

FROM Orders

JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
JOIN Customers ON Orders.CustomerID=Customers.CustomerID

WHERE
	Shippers.ShipperName='Speedy Express'
  AND
  Customers.Country='Brazil'
```

## Проектирование БД

1. На одном сервере могут находиться **СУБД (DBMS)**
- **сетевой порт** - сетевой идентификатор процесса (программы)
1. В одной **СУБД** может находиться несколько **БД**
2. В одной **БД** может храниться несколько типов сущностей (объектов)
3. Стандартный подход: **ОДНА БД == ОДИН ПРОЕКТ**
4. Стандартный подход: **ОДНА СУЩНОСТЬ == ОДНА ЗАПИСЬ**

## Общие этапы проектирования БД

1. Анализ предметной области (бизнес-процессов)
2. Выделение сущностей и их свойств (характеристик)
3. Связывание сущностей между собой (установление связей)
    1. с помощью ключевых полей (`первичный` и `внешний` ключи)
4. Проверка решения (гипотезы)

## Первичный ключ (primary key)

- Является идентификатором каждой сущности

**Свойства**

- уникальный
- неизменяемый
- ненулевой

**Стандартные подходы к определению значения**

1. Авто-инкремент
2. Случайные значения (`UUID`, `GUID`, `ULID`)

## Унификация хранимых данных

- Приведение к единому виду
    - например, **номер телефона**

## Базовые виды связей между сущностями

- `1:1` (один к одному)
- `1:M` (один ко многим)
- `M:M` (многие ко многим)

## Пример схемы БД “соц/сеть”

**Сущности**

- `users`
- `posts`
- `comments`
- `reactions`
- `friends`
- `chats`
- `messages`