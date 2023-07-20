Базы данных и Spring
====================

JPA - Java Persistence API

https://spring.io/guides/gs/accessing-data-mysql/
https://spring.io/guides/gs/accessing-data-jpa/
https://spring.io/guides/gs/accessing-data-rest/

Entity - представление таблицы. Объект - запись(строка) в таблице.

```java
@Entity
@Table(name = "students_table")
class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "student_name")
    private String studentName;    // Getters and Setters, omitted for brevity}
}
```

Repository - класс для взаимодейтвия с БД. Запросы(поиск, сохранение, обновление) с БД в коде делаем
через репозиторий.

```java
@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findByCity(String city);
}
```

- [CrudRepository](https://docs.spring.io/spring-data/data-commons/docs/current/api/org/springframework/data/repository/CrudRepository.html) - базовая функциональность по чтению и сохранению в БД.
- [PagingAndSortingRepository](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html) - Pagination и сортировка
- [JpaRepository](https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html) - flushing the persistence context and deleting records in a batch

CrudRepository < PagingAndSortingRepository < JpaRepository 

JpaRepository - предоставляет самую богатую функциональность.

Почитать

[CrudRepository, JpaRepository, and PagingAndSortingRepository in Spring DatA](https://www.baeldung.com/spring-data-repositories)

## Создаем запросы без написания SQL.

```
List<Event> findByCity(String city); // select id, billing_account, city, name from event where city=?
```

(https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation)

## Создаем запросы с помощью SQL

(https://www.bezkoder.com/spring-jpa-query/)

// Not a real SQL
```java
@Query("SELECT e FROM Event e WHERE e.city = 'Berlin'")
List<Event> getBerlinEvents();
```

(https://www.bezkoder.com/spring-jpa-query/)

## Mapping Entities to DTOs and back

![](https://www.baeldung.com/wp-content/uploads/2021/08/layers-4.svg)

(https://modelmapper.org)

Конвертация одного объекта

DTO -> Entity

```java
Event event = modelMapper.map(eventDTO, Event.class);
```

Entity -> DTO

```java
EventDTO eventDto = modelMapper.map(event, EventDTO.class);
```

Конвертация списка

(https://www.baeldung.com/java-modelmapper-lists)

DTO -> Entity

```java
List<Event> result = modelMapper.map(events, new TypeToken<List<Event>>(){}.getType());
```

Entity -> DTO

```java
List<EventDTO> result = modelMapper.map(events, new TypeToken<List<EventDTO>>(){}.getType());
```

Рассмотрели
- Работу на DAO уровне с помощью 

## Подключение к БД MySQL

https://spring.io/guides/gs/accessing-data-mysql/

application.properties

```
# Log SQL
spring.jpa.show-sql=true
# Auto creates tables
spring.jpa.hibernate.ddl-auto=update

# localhost - адрес компьютера с БД
# 3306 - post 
# tickets <- название базы данных

# Полный адрес для обращения к базе
spring.datasource.url=jdbc:mysql://localhost:3306/tickets

# Пользователь. Должен быть заведен с MySQL
spring.datasource.username=application
spring.datasource.password=Secret-123

# Говорим, что используем MySQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

```

## Bonus

## Query logging


https://www.baeldung.com/sql-logging-spring-boot

https://stackoverflow.com/questions/30118683/how-can-i-log-sql-statements-in-spring-boot
