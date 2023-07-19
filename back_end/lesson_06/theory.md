Swagger OpenAPI, Lombok
=======================

## OpenAPI и SwaggerUI

- Удобный web-интерфейс-документация 
- Можно документировать API прямо из кода

Устанавливаем OpenAPI и SwaggerUI

**Note**: For spring-boot 3 support, make sure you use springdoc-openapi v2


Gradle. Добавляем в dependencies

https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui/2.1.0

```
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0'
``` 

(http://localhost:8080/swagger-ui)

Конфигурация:

```java
@SpringBootApplication
public class ServingWebContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

	@Bean
	public OpenAPI baseOpenApi()
	{
		return new OpenAPI().info(new Info()
				.title("Ticket Shop")
				.version("1.0.0")
				.description("Ticket shop REST API"));
	}
}
```


```
@RestController
@Tag(name = "Events", description = "Working with events")
public class EventsController {
}
```

```
@Schema(description = "Name of the event")
private String name;
```
## Почитать и посмотреть

Хорошая статья с примером документации

https://www.dariawan.com/tutorials/spring/documenting-spring-boot-rest-api-springdoc-openapi-3/

[How To Add OpenAPI And Swagger To Spring Boot Application](https://www.youtube.com/watch?v=A_RWUcTqHBI)

# Lombok

Избавляет от написания повторяющегося кода: геттеры, сеттеры, конструкторы, toString()

https://projectlombok.org/setup/gradle

```groovy
plugins {
  id "io.freefair.lombok" version "8.0.1"
}
```

https://auth0.com/blog/a-complete-guide-to-lombok/

Полезные аннотации

  - @Getter, @Setter
  - @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor

Посмотреть

[Use Lombok to create a Java DTO quickly in IntelliJ IDEA](https://youtu.be/YSSdcomdR-4)

# Return HTTP code

https://stackabuse.com/how-to-return-http-status-codes-in-a-spring-boot-application/

https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods

https://www.baeldung.com/spring-response-entity

@ResponseStatus(code = HttpStatus.CREATED)

# DTO - Data Transfer Object

