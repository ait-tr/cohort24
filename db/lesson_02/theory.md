## Ссылки

- [типы данных (MySQL)](https://dev.mysql.com/doc/refman/8.0/en/data-types.html)
- [типы данных (PostgreSQL)](https://www.postgresql.org/docs/current/datatype.html)

## SQL - файл

Текстовый файл с SQL-запросами

```sql
-- homework.sql
-- Задача 1. Вывести ..
SELECT *
FROM Customers;
```

## SQL: CRUD

- **Create**
    - `INSERT INTO`
- **Read**
    - `SELECT`
    - `SELECT DISTINCT`
- **Update**
    - `UPDATE`
- **Delete**
    - `DELETE FROM`
        
        ![Screenshot from 2023-07-27 20-15-35.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02b846ee-e552-4096-b660-d5058e51aeb2/Screenshot_from_2023-07-27_20-15-35.png)
        
        **Задача. Вывести номер и дату самого последнего заказа**
        
        ```sql
        SELECT
        		OrderID,
            OrderDate
        FROM Orders
        
        ORDER BY OrderDate DESC
        
        LIMIT 1
        ```
        
        ## Поиск по шаблону / Оператор LIKE
        
        - поиск по нестрогому соответствию
        
        **Базовые подстановочные символы (знаки)**
        
        - `%` нулевой, один или несколько символов
        - `_` один символ
        
        **Пример. Вывести перевозчиков, имя которых начинается с буквы `S`**
        
        ```sql
        SELECT *
        FROM Shippers
        WHERE
        	ShipperName LIKE 's%'
        ```
        
        **Пример. Вывести всех клиентов из `USA`**
        
        ```sql
        SELECT *
        FROM Customers
        WHERE
        	Country LIKE 'usa'
        ```
        
        **Задача. Вывести имена и фамилии сотрудников, у которых в имени или фамилии есть вхождение строки `lio`**
        
        ```sql
        SELECT
        		FirstName,
            LastName
        FROM Employees
        
        WHERE
        		FirstName LIKE '%lio%'
            OR
            LastName LIKE '%lio%'
        ```
        
        **Задача. Вывести три самых дешевых товара с ценой от `50` до `150` из категорий `3` и `6`**
        
        ```sql
        SELECT *
        FROM Products
        
        WHERE
        		Price >= 50 AND Price <= 150
            AND
            CategoryID IN (3, 6)
        
        ORDER BY Price ASC
        LIMIT 3
        ```
        
        ## Работа с диапазоном значений / оператор `BETWEEN`
        
        **Пример. Выбрать товары по диапазону цены**
        
        ```sql
        -- без оператора BETWEEN
        SELECT *
        FROM Products
        WHERE
        		Price >= 100
            AND
            Price <= 200
        
        -- с BETWEEN
        SELECT *
        FROM Products
        WHERE
        		Price BETWEEN 100 AND 200
        ```
        
        **Задача. Вывести товары из категории `1` и `5` с ценой от `10` до `150` EUR**
        
        ```sql
        SELECT *
        FROM Products
        
        WHERE
        		Price BETWEEN 10 AND 150
        		AND
        		CategoryID IN (1, 5)
        ```
        
        ## SQL CRUD: Delete / удаление записей / Оператор `DELETE FROM`
        
        **Пример. Удалить указанных клиентов**
        
        ```sql
        DELETE FROM Customers
        WHERE
        	CustomerID IN (1, 3)
        ```
        
        **Задача. Удалить товары, дешевле `5` EUR**
        
        ```sql
        DELETE FROM Products
        WHERE
        	Price < 5
        ```
        
        ## SQL CRUD: Update / модификация / Оператор `UPDATE`
        
        **Пример**
        
        ```sql
        -- очистить указанные поля у клиента 1
        UPDATE Customers
        SET
        	CustomerName='',
        	ContactName=''
        WHERE
        	CustomerID=1
        ```
        
        **Задача. Для поставщиков из `Japan` и `Spain` изменить телефон и контактное имя на произвольные значения**
        
        ```sql
        UPDATE Suppliers
        SET
        	ContactName='Ivan Ivanov',
        	Phone='0000000000'
        WHERE
        	Country IN ('Japan', 'Spain')
        ```
        
        **Задача. У всех товаров от `50` до `60` (EUR) очистить `название` и установить `категорию 2`**
        
        ```sql
        UPDATE Products
        SET
        		ProductName='',
        	  CategoryID=2
        WHERE
        	Price BETWEEN 50 AND 60
        ```
        
        ## SQL CRUD: Create / добавление / Оператор `INSERT INTO`
        
        **Пример**
        
        ```sql
        -- добавить двух перевозчиков
        INSERT INTO Shippers (ShipperName)
        VALUES
        		('Shipper 1'),
            ('Shipper 2')
        ```
        
        **Задача. Добавить произвольного поставщика из `China`**
        
        ```sql
        INSERT INTO Suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
        VALUES 
        	('XYZ Company', NULL, NULL, NULL, NULL, 'China', NULL);
        ```
        
        ### Первичный ключ в БД / PRIMARY KEY
        
        Это поле, которое однозначно идентифицирует каждую запись
        
        - в качестве значения используют
            - авто-инкремент
            - случайные значения (стандарт `UUID` и т.д.)
        
        **Свойства**
        
        - уникальность
        - непустой
        - неизменяемость
        
        ## САМАЯ РАСПРОСТРАНЕННАЯ АРХИТЕКТУРА ХРАНЕНИЯ ДАННЫХ
        
        - **ОДИН ОБЪЕКТ (СУЩНОСТЬ) == ОДНА ЗАПИСЬ**
        
        ## Внешний ключ (FOREIGN KEY)
        
        - поле для связи между таблицами
        
        ## Типы связей между таблицами
        
        - `1:1` (один к одному)
        - `1:M` (один ко многим)
        - `M:M` (многие ко многим)
        
        ## Универсальный поля (для любой сущности)
        
        - первичный ключ (`id, user_id`)
        - дата/время добавления записи (`dt, datetime, created_at`)
        
        ## Горизонтальное объединение таблиц / Оператор `JOIN`
        
        - синтаксис `JOIN`
        
        ```sql
        SELECT <проекция>
        FROM <таблица_1>
        
        JOIN <таблица_2> ON <таблица_1.внешний_ключ>=<таблица_2.первичный_ключ>
        ```
        
        **Пример. Вывести данные о товарах и их поставщиках**
        
        (проекция: `название_товара`, `стоимость_товара`, `название_компании_поставщика`)
        
        ```sql
        SELECT
        		Products.ProductName,
            Products.Price,
            Suppliers.SupplierName
        FROM Products
        
        JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
        ```
        
        **Пример. Вывести данные о заказах**
        
        ```sql
        SELECT *
        FROM Orders
        
        JOIN Customers ON Orders.CustomerID=Customers.CustomerID
        JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID
        JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
        ```
        
        **Задача. Вывести информацию о заказах из `Germany`**
        
        ```sql
        SELECT *
        FROM Orders
        
        JOIN Customers ON Orders.CustomerID=Customers.CustomerID
        
        WHERE
        	Customers.Country='Germany'
        ```
        
        **Задача. Вывести все заказы, которые повезет `Speedy Express`**
        
        ```sql
        SELECT * 
        FROM Orders
        
        JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
        ****
        WHERE
        	Shippers.ShipperName='Speedy Express'
        ```
        
        **Задача. Вывести информацию о товарах:**
        
        - `название_товара`
        - `стоимость_товара_в_долларах`
        - `название_категории`
        
        ```sql
        SELECT
        		Products.ProductName,
            Products.Price * 1.1 AS Price_usd,
            Categories.CategoryName
        
        FROM Products
        
        JOIN Categories ON Products.CategoryID=Categories.CategoryID
        ```
        
        ## Семантическое версионирование (SemVer)
        
        - Методология (де-факто пром/стандарт) нумерации версий проекта (версионирование)
        
        ### v`MAJOR`.`MINOR`.`PATCH`
        
        `PATCH` - исправление багов, прочие мелкие правки
        
        `MINOR` - улучшения (без нарушения обратной совместимости)
        
        `MAJOR` - координальные изменения (с нарушением обратной совместимости)
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f95bda10-6ff6-4977-b85b-bf0b45a3d953/Untitled.png)
        
        **Контрольные вопросы по SemVer**
        
        1. Какой будет след/версия, если был добавлен новый функционал?
            
            **`v3.5.4`** 
            
        2. Какой будет след/версия, если было исправлено три бага?
        `**v8.2.6`**
		
        3. Какой будет след/версия, если приложение было полностью переработано?
        `**v5.7.6**`