3-tier architecture in Spring Boot
==================================

Слои/уровни

1. Presentation Layer
    - Как данные отдаются наружу
2. Business Logic Layer
    - Основная логика здесь
3. Data Access Layer
    - Работа с базой данных(сохранене, удаление, обновление, поиск) или с другими системами хранения

- Каждый слой выполняет свою задачю
- Каждый слой общается, только со слоем ниже

![](https://1.bp.blogspot.com/-PIbPpPIzkIA/Xwfy3JShvQI/AAAAAAAAH_M/O8N2xbXfqtsGH7jQdfpC9f3GvtKYvT_CACLcBGAsYHQ/s1600/Screenshot%2B06-27-2020%2B22.27.59.png)

## Слои в Spring Boot

- Controllers - Presentation Layer
- Services - Business Logic Layer
- Repositories + Entities - Data Access Layer

## Почитать про слои

Трёхуровневая архитектура
https://en.wikipedia.org/wiki/Multitier_architecture

https://www.javaguides.net/2020/07/three-tier-three-layer-architecture-in-spring-mvc-web-application.html

## Структурирование кода

Или как разложить свой код по package'ам и файлам

https://www.geeksforgeeks.org/spring-boot-code-structure/

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.structuring-your-code

https://studygyaan.com/spring-boot/spring-boot-project-folder-structure-and-best-practices

https://www.geeksforgeeks.org/spring-boot-code-structure/

Есть два подхода
- По слоям
    - Все контроллеры лежат в одном package, все сервисы в другом, все репозитории еще в одном
- По логике
    - Внутри одного логического package лежит все, что к нему относится

## План по коду

- Создать слой Business Logic Layer
    - Вынесем логику в сервисы
- Создать слой Data Layer
    - Добавить зависимости, подключить базу данных H2
    - Создать Entity
    - Создать Repository

# @Component vs @Controller vs @Service vs @Repository

![](https://1.bp.blogspot.com/-3b8uH8fTVg8/XuTWvDI6HQI/AAAAAAAAf4I/w69edjz9VJwX1Idf1MpNDdcXd0-m-EnYwCLcBGAsYHQ/w1200-h630-p-k-no-nu/difference%2Bbetween%2BController%2Bvs%2BService%2Bvs%2BRepository%2Bin%2BSpring.png)

Подробнее о разнице - [StackOverflow: What's the difference between @Component, @Repository & @Service annotations in Spring?](https://stackoverflow.com/a/38549461)

## Заметки

Мы используем свежий Spring.

javax -> Jakarta

https://spring.io/blog/2022/05/24/preparing-for-spring-boot-3-0

https://stackoverflow.com/questions/73350585/upgrade-from-spring-boot-2-7-2-to-spring-boot-3-0-0-snapshot-java-package-java
