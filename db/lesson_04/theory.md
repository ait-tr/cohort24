## Оператор `LIKE`

- поиск (соответствие) шаблону / нестрогий поиск / неполное соотвествие

## Оператор `JOIN`

- горизонтальное объединение таблиц

## Ключевые поля

- **первичный ключ** - поле для идентификации объекта (сущности)
- **внешний ключ** - поле для связи между таблицами

**Примеры**

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
-- Вывести MAX-стоимость товаров с ценой от 20 до 200 EUR из категории 4
SELECT
	MAX(Price) AS max_price
FROM Products

WHERE
		Price BETWEEN 20 AND 200
    AND
    CategoryID=4
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

## **Группировка в SQL (механизм агрегации) / оператор `GROUP BY`**

**Категории запросов**

1. **CRUD** - простые запросы
2. **Aggregation** - получение вычисленных данных

**Группировка** - объединение записей на основе общего признака с целью получения обобщеных данных

**Пример. Вывести страны покупателей**

```sql
SELECT DISTINCT
	Country
FROM Customers

-- вывести количественное распределение клиентов по странам
SELECT
		Country,
    COUNT(*) AS total_customers
FROM Customers
GROUP BY Country
```

**Пример. Найти кол. распределение товаров по категориям**

```sql
SELECT
		CategoryID,
    COUNT(*) AS total_products
FROM Products

GROUP BY CategoryID

ORDER BY total_products DESC
```

**Задача. Вывесли кол/распределение товаров по поставщикам**

```sql
SELECT
	SupplierID,
	COUNT(*) AS total_products
FROM Products

GROUP BY SupplierID

ORDER BY total_products DESC
```

**Задача. Вывести страну, где больше всего клиентов (проекция: `страна`, `ко_во_клиентов`)**

```sql
SELECT
	Country,
	COUNT(*) AS total_customers
FROM Customers

GROUP BY Country

ORDER BY total_customers DESC
LIMIT 1
```

**Задача. Найти сред/стоимость товара для каждого поставщика (проекция: `название_поставщика`, `сред_стоимость`)**

```sql
SELECT
		Suppliers.SupplierName,
    AVG(Products.Price) AS avg_price
FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

GROUP BY Suppliers.SupplierID
```

**Задача. Вывести ТОП-1 компанию (и ко-во перевезенных заказов) по количеству доставленных заказов**

(проекция: `название_перевозчика`, `ко_во_заказов`)

```sql
SELECT
		Shippers.ShipperName,
    COUNT(*) AS total_orders
FROM Orders

JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
GROUP BY Orders.ShipperID

ORDER BY total_orders DESC
LIMIT 1
-- LIMIT 1 OFFSET 1 // кто на втором месте
```

**Задача. Вывести стоимость каждого заказа (проекция: `номер_заказа`, `стоимость_заказа`)**

```sql
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost
FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.OrderID

ORDER BY order_cost DESC
```

**Задача. Расчитать З/П менеджеров (ставка - `5%`от суммы проданных заказов)**

(проекция: `фамилия_менеджера`, `з_п`)

```sql
SELECT
		Employees.LastName,
    SUM(OrderDetails.Quantity * Products.Price) * .05 AS salary
FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID
JOIN Orders ON OrderDetails.OrderID=Orders.OrderID
JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID

GROUP BY Orders.EmployeeID

ORDER BY salary DESC
```

## Фильтрация агрегированных данных / оператор `HAVING`

- аналог `WHERE`, который позволяет отфильтровать агрегированные данные

**Пример. Вывести менеджеров, у которых З/П от `2000` EUR**

```sql
SELECT
		Employees.LastName,
    SUM(OrderDetails.Quantity * Products.Price) * .05 AS salary
FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID
JOIN Orders ON OrderDetails.OrderID=Orders.OrderID
JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID

GROUP BY Orders.EmployeeID
HAVING
	salary >= 2000

ORDER BY salary DESC
```

**Задача. Вывести названия категорий, в которых средняя стоимость выше `40` EUR**

(проекция: `название_категории`, `сред_стоимость_товаров`)

```sql
SELECT
	Categories.CategoryName,
	AVG(Products.Price) AS avg_price
FROM Products

JOIN Categories ON Categories.CategoryID=Products.CategoryID
-- JOIN Categories USING(CategoryID)

GROUP BY Categories.CategoryID
HAVING
	avg_price >= 40

ORDER BY avg_price DESC
```

## Оператор `LEFT JOIN`

- условно, называют “безопасным”

```sql
-- Вывести заказы имеющихся клиентов
SELECT *
FROM Orders
JOIN Customers ON Orders.CustomerID=Customers.CustomerID

-- Вывести ВСЕ заказы, включая заказы клиентов, которые были удалены
SELECT *
FROM Orders
LEFT JOIN Customers ON Orders.CustomerID=Customers.CustomerID
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/220b9a80-cd4d-4515-9fb9-7df2753996ad/Untitled.png)

**Пример. Вывести товары, которые не были заказаны ни разу**

```sql
SELECT
		Products.ProductName,
    Products.ProductID
FROM Products

LEFT JOIN OrderDetails USING(ProductID)

WHERE
	OrderDetails.ProductID IS NULL
```

**Задача. Вывести фамилии менеджеров, у которых отсутствуют заказы**

```sql
SELECT 
	Employees.LastName
FROM Employees

LEFT JOIN Orders ON Employees.EmployeeID=Orders.EmployeeID

WHERE
	Orders.EmployeeID IS NULL
```

**Задача. Описать схему онлайн-школы (только в части студентов и групп)** 

(обратить внимание на отношение студента к группе)