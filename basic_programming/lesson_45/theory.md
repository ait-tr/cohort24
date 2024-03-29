# Класс `Collections`

Класс `Collections`, как и класс `Math`, в основном содержит **статические** методы и предназначен для работы с коллекциями - списками и множествами.

Все методы класса описаны в [документации](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Collections.html#method-summary).

Примечание: для работы с массивами есть похожий класс [`Arrays`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Arrays.html).

Нас интересуют в первую очередь методы:
- `max(Collection<?> coll)`
- `min(Collection<?> coll)`
- `reverse(List<?> list)`
- `sort(List<T> list)`

Методы `min()` и `max()` работают с любыми коллекциями (см. интерфейс `Collection` ниже) и возвращают минимальный и максимальный элементы.

Методы `reverse()` и `sort()` работают с любыми списками (интерфейс `List`) и переворачивают или сортируют список. Изменения происходят "на месте" (*in-place*) - меняется существующий список (переданный в аргументах), а не создаётся новый.

Для их использования **Java** должна знать, как сравнивать объекты - то есть замечательно сработает с `List<Integer>` или `List<String>`, но будет недоумевать при попытке отсортировать список `List<Human>` с нашим собственным классом `Human`.

# Интерфейс `Collection`

Чтобы **Java** в целом и класс `Collections` в частности могли работать с любыми списками и множествами, мы должны пообещать, что у всех у них будут какие-то "базовые", одинаковые методы.

Метод должен уметь искать максимум одинаково в любой коллекции, и авторам не хотелось бы отдельно писать метод для `ArrayList` - и отдельно почти такой же для `HashSet`.

В **Java** "обещание существования общих методов" обычно делается через *наследование* или *интерфейсы*. А набор таких общих методов и называется **интерфейсом**.

Это значит, что для коллекций должен быть общий интерфейс - и давайте рассмотрим схему взаимосвязей между интерфейсами коллекций.
![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_45/img/interfaces.jpeg)

Обратите внимание:
- всё, что вы тут видите, это интерфейсы.
- стрелочки обозначают «наследуется от».
- `List`, `Set`, `Queue` наследуются от `Collection`, а `Map` – **нет**. Потом от этих интерфейсов наследуются абстрактные классы, а от них в свою очередь – известные нам реализации: `ArrayList`, `HashSet`…

А так выглядит общая схема взаимосвязей между интерфейсами и коллекциями (на схеме пропущены промежуточные абстрактные классы).
![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_45/img/collections.webp)

Данную схему можно сопоставлять с документацией и выяснять, можно ли использовать конкретный метод из `Collections` (например, `sort()`) с конкретной коллекцией (например, `HashSet`).

# Интерфейс `Comparable<?>`

Мы знаем, как работает оператор “`==`”, а также о методах `equals()` и `hashCode()`.

Сравнение — не совсем об этом. Раньше мы имели в виду скорее «проверку объектов на равенство».

А у сравнения объектов друг с другом могут быть совсем другие цели! Самая очевидная из них — сортировка.

Так можно отсортировать список `ArrayList<>` чисел или строк:
```java
public static void main(String[] args) {
  List<String> names = new ArrayList<>();
  names.add("Маша");
  names.add("Саша");
  names.add("Даша");

  Collections.sort(names);
  System.out.println(names);
}
```
Вывод в консоль:
```
[Даша, Маша, Саша]
```

Но если мы захотим описать собственный класс и сравнить его экземпляры, **Java** самостоятельно с этим не справится:

```java
public class Car {

  private int manufactureYear;
  private String model;
  private int maxSpeed;

  public Car(int manufactureYear, String model, int maxSpeed) {
    this.manufactureYear = manufactureYear;
    this.model = model;
    this.maxSpeed = maxSpeed;
  }

  //...геттеры, сеттеры, toString()
}

public class Main {

  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();

    cars.add(new Car(1990, "Ferrari 360 Spider", 310));
    cars.add(new Car(2010, "Bugatti Veyron", 350));
    cars.add(new Car(2012, "Lamborghini Gallardo", 290));

    Collections.sort(cars); // тут ошибка
    System.out.println(cars);
  }
}
```

При попытке отсортировать автомобили в списке даже у нас, а уж тем более у **Java**, должен возникнуть вопрос: а *как* их отсортировать?

Мы должны как-то научить **Java** сравнивать эти объекты. Причем сравнивать так, как это нужно нам.

Для этого в **Java** есть специальный инструмент — интерфейс `Comparable`.

С английского языка это переводится как «сравнимый». Чтобы наши объекты `Car` можно было сравнивать друг с другом и как-то сортировать, класс должен реализовать этот интерфейс и реализовать его единственный метод — `compareTo()`.

Внутри метода `compareTo()` мы реализуем логику сравнения машин.

**Внимание:** метод `compareTo()` возвращает значение `int`, а не `boolean`.

Дело в том, что сравнение двух объектов дает нам 3 возможных варианта:
- а < b
- a > b
- a == b.

У `boolean` же есть всего 2 значения — `true` и `false`, что не подходит для сравнения объектов.

С `int` все намного проще:
- если возвращаемое значение > 0, значит, a > b,
- если возвращаемое значение < 0, значит, а < b,
- если результат == 0, значит, a == b.


```java
public class Car implements Comparable<Car> {

  private int manufactureYear;
  private String model;
  private int maxSpeed;

  public Car(int manufactureYear, String model, int maxSpeed) {
    this.manufactureYear = manufactureYear;
    this.model = model;
    this.maxSpeed = maxSpeed;
  }

  @Override
  public int compareTo(Car o) {
    return this.getManufactureYear() - o.getManufactureYear();
  }

  //...геттеры, сеттеры, toString()
}
```
**Обратите внимание:** мы указали интерфейс `Comparable<Car>`, а не просто `Comparable`. Это **типизированный** интерфейс, то есть он требует указания конкретного класса, с которым он связан.

Что происходит?

Мы берём один объект машины (`this`), год выпуска этой машины и вычитаем из него год выпуска другой машины (той, с которой сравниваем объект).
Если год выпуска первой машины больше, метод вернет `int` > 0.
А значит, машина `this` > машины `о`.

Если наоборот — год выпуска второй машины (`о`) больше, значит метод вернет отрицательное число, а следовательно, `о` > `this`.

Ну а если они равны, метод вернет `0`.

Такого простого механизма уже достаточно, чтобы сортировать коллекции объектов `Car`! Больше ничего делать не нужно.

После реализации интерфейса программа сможет отсортировать автомобили и выдаст следующий результат:
```
[Car{manufactureYear=1990, model='Ferrari 360 Spider', maxSpeed=310},
Car{manufactureYear=2010, model='Bugatti Veyron', maxSpeed=350},
Car{manufactureYear=2012, model='Lamborghini Gallardo', maxSpeed=290}]
```
