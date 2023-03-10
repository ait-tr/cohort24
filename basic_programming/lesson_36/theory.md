# ООП

ООП (OOP) - объектно-ориентированное программирование (Object-Oriented Programming).

Парадигма программирования - общий набор идей о том, как структурировать программу и организовать взаимодействие между её компонентами.

ООП поддерживается и используется как основная, а чаще всего как единственная парадигма большинством языков программирования, включая Java, JavaScript, C#, C++, Python etc.

Основная идея ООП - представление программы как системы взаимодействующих **объектов** различных **классов**.

# Классы

Вся программа состоит из классов (class), эти классы взаимодействуют друг с другом.

У каждого класса есть:
- методы - действия этого класса или над этим классом.
- атрибуты - свойства класса в целом (статические) или отдельного объекта.

**Обычно** каждый класс описан в отдельном файле.

# Инкапсуляция

Инкапсуляция - механизм языка, ограничивающий доступ одних компонентов программы к другим.

Слово "инкапсуляция" происходит от латинского "in capsula" — "размещение в оболочке".

Для нас инкапсуляция - написание кода таким образом, чтобы каждый класс был максимально самостоятельным и не зависел от других классов.

Его внутреннее устройство не должно никого интересовать и не должно ни на что влиять; каждый класс - "чёрный ящик" с набором кнопок (публичных методов).

# Методы

Методы - действия, связанные с этим классом.

Все действия программы, все команды языка Java пишутся только внутри одного из методов.

Метод `public static void main(String[] args)` позволяет запустить программу, начиная с этого файла. В таком случае программа становится экземпляром класса, соответствующего этому файлу, и именно из команд, перечисленных в методе `main`, состоит код программы.

# Атрибуты

Атрибуты - свойства конкретного экземпляра или класса в целом.

Обычно атрибуты напрямую (из других классов) менять нельзя, они должны быть недоступны.

Поэтому все атрибуты пишем так:
```java
private Тип имяАтрибута;
```

# Некоторые разновидности методов

## Конструкторы

Первый метод класса - конструктор (constructor) - от слова "конструировать" - создавать.

Его название совпадает с названием класса. Возвращаемого типа у конструктора **нет**.
```java
public class Cat {

  private String name;

  public Cat(String catName) {
    name = catName;
  }
}
```

Конструктор без аргументов - это метод, который вызывается при создании объекта оператором `new`.

Конструктор без аргументов создаётся автоматически для любого класса самим языком Java.

Писать его не нужно - но можно, если вы хотите что-то добавить.

Конструктор с аргументами позволяет задать атрибуты сразу при создании (см. пример выше).

Как только мы создали конструктор с аргументами, системный **конструктор без аргуметов пропадает**.

Если нужно использовать конструктор без аргументов, придётся его написать самостоятельно:
```java
public class Cat {

  private String name;

  public Cat() {
    name = "Безымянный";
  }

  public Cat(String catName) {
    name = catName;
  }
}
```

Конструкторов может быть несколько -- а может быть только один. Решать вам. Конструкторы отличаются друг от друга набором аргументов - только типами, на имена Java внимания не обращает.

Служебное слово `this` позволяет обратиться к конкретному (текущему, **этому**) экземпляру класса:
```java
public class Cat {

  private String name;

  public Cat() {
    name = "Безымянный";
  }

  public Cat(String name) {
    this.name = name; // если не написать this, то будет изменён аргумент метода, а не атрибут объекта
  }
}
```

# Сеттеры (Setters)

Методы для изменения атрибутов принято называть сеттерами (setters) от английского глагола *set* - задать (установить).

Название метода традиционно выглядит как `public void setАтрибут(ТипАтрибута новоеЗначение)`.

Метод позволяет как задать атрибут, если он не был задан конструктором, так и изменить уже заданный.

```java
public class Cat {

  private String name;

  public setName(String catName) {
    name = catName;
  }
}
```

В сеттерах может быть дополнительная проверка:
```java
public class Person {

  private int age;

  public void setAge(int age) {
    if (age < 0) {
      System.out.println("Возраст не может быть отрицательным: " + age);
      return;
    }
    this.age = age;
  }
}
```

Сеттеры создаются сразу для всех атрибутов, которые пользователь (другой код) должен иметь возможность менять.

# Геттеры

Так как атрибуты класса спрятаны от прямого доступа и доступны только через методы, нам необходимы геттеры - методы, которые покажут значение конкретного атрибута конкретного класса.

Название происходит от английского глагола *get* - получить.

Название метода традиционно выглядит как `public ТипАтрибута getАтрибут()`.

```java
public class Person {

  private int age;

  public void setAge(int age) {
    if (age < 0) {
      System.out.println("Возраст не может быть отрицательным: " + age);
      return;
    }
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
```

Геттеры создаются сразу для всех атрибутов, которые пользователь (другой код) должен иметь возможность смотреть.

# Статичные методы и атрибуты.

`static` - английское "статичный", не связанный с конкретным экземпляром, не меняющийся. Антоним в данном контексте - динамичный, меняющийся вместе с конкретным экземпляром.

Статичные методы и атрибуты СВЯЗАНЫ с классом, поэтому их нельзя написать "где-то ещё", но ничего не знают про атрибуты и методы конкретного объекта.

Пример: `String.format()` - отдаёт форматированную строку, но собирает её из аргументов своего вызова.Метод определённо связан с классом `String`, но никак не связан с любой уже существующей строкой - он создаёт новую.

Статичными могут быть многие "библиотечные" методы - например, получение двоичной записи числа. Статичными были все написанные нами до этого методы, статичным всегда является сам метод `main()`.

Также статичными будут все константы класса.
