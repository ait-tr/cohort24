DI
==

## Зависимости и их минусы

```java
class PaymentService
{
    PaymentService()
    {
        this.paymentProvier = new SomeBankPaymentProviver();
    }

    void doPayment(Account srcAccount, Account dstAccount)
    {
        // some code...
        paymentProvier.doSomeOperation();
        // some code...
    }
};
```

Минусы:
- Плохо заменяется на другой paymentProvider
- Плохо тестируется

**Dependency Injection(DI)** is a design pattern in which an object or function receives other objects
or functions that it depends on.

Суть - создаем зависимость(объект) не внутри класса, а за его пределами и передаем его в наш класс.

class PaymentService
{
    // Dependency Injection happens here.
    PaymentService(PaymentProvider paymentProvider)
    {
        this.paymentProvier = paymentProvider;
    }

    void doPayment(Account srcAccount, Account dstAccount)
    {
        // some code...
        paymentProvier.doSomeOperation();
        // some code...
    }
};


Плюсы:

- Меньшая связность между классами. Можно менять один класс без другого
- Возможность замены одной зависимости на другую
- Тестируемость
 
## Inversion of Control (IoC)

Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework.

Мы переносим(inversion) контороль за объектами: их создание и передачу объектов на внешную систему. Мы делем это не в нашем коде, а в системе Spring IoC Container.

## Заметки

- [@Controller](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html) влечет за собой @Component, что означает что это класс управляется Spring IoC Container.
- The objects that are managed by the Spring IoC container are called **beans**.

## Итого

- Рассмотрели, что такое DI
- Рассмотрели, как делать DI с помощью IoC и аннотаций (@Component, @Service, @Autowired, @Primary)
    - Constructor based
    - Property based
    - Setter based
- Java-based configuration
- Не рассмотрели
    - XML-configuration
 
## Ссылки

- [What is Spring Framework? An Unorthodox Guide](https://www.marcobehler.com/guides/spring-framework)/[Что такое Spring Framework? От внедрения зависимостей до Web MVC](https://habr.com/ru/articles/490586/)
- [Spring Framework Tutorial](https://youtube.com/playlist?list=PLfu_Bpi_zcDNbpxlrBl3Sng5F9qU7Cz5D)
- [@Component vs @Service vs @Repository](https://www.baeldung.com/spring-component-repository-service)
- [Spring @Bean Annotation with Example](https://www.geeksforgeeks.org/spring-bean-annotation-with-example/)
