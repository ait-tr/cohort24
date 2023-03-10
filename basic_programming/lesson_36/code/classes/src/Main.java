public class Main {

  // ООП - объектно-ориентированное программирование
  // OOP - Object-Oriented Programming
  // парадигма программирования - общий набор идей о том, как структурировать программу и
  // организовать взаимодействие между её компонентами
  // ООП поддерживается / используется как основная, а чаще всего как единственная парадигма
  // большинством языков программирования, включая Java, JavaScript, C#, C++, Python

  // вся программа состоит из классов (class), эти классы взаимодействуют друг с другом
  // у каждого класса есть:
  // - методы (действия этого класса / над этим классом)
  // - атрибуты (свойства класса в целом или отдельного объекта)
  // ОБЫЧНО каждый класс описан в отдельном файле
  // свойства объекта - атрибуты класса

  // Инкапсуляция - механизм языка, ограничивающий доступ одних компонентов программы к другим.
  // Слово "инкапсуляция" происходит от латинского "in capsula" — "размещение в оболочке".
  // Написание кода таким образом, чтобы каждый класс был максимально самостоятельным и не зависел
  // от других классов.
  // Его внутреннее устройство не должно никого интересовать и не должно ни на что влиять;
  // каждый класс - "чёрный ящик" с набором кнопок (публичных методов).

  // некоторые разновидности методов:
  // конструкторы
  // геттеры
  // сеттеры

  // важное ключевое слово:
  // static - статичный, не связанный с конкретным экземпляром
  // антоним - динамичный, меняющийся вместе с конкретным экземпляром
  // статичные методы и атрибуты СВЯЗАНЫ с классом
  // НО НИЧЕГО не знают про АТРИБУТЫ и методы КОНКРЕТНОГО объекта
  // Пример: String.format() - отдаёт форматированную строку, но собирает её из аргументов
  // метод определённо связан с классом String, но никак не связан с любой уже существующей строкой
  // например, статичными будут все константы

  public static void main(String[] args) {
    Car myCar = new Car("Tesla Model S");
    Car anotherCar = new Car("Volkswagen Golf", "EN 123");
    // что мы умеем делать с классами:
    // - создавать переменные
    // - создавать массивы: Car[] cars
    // - создавать списки: List<Car>
    // - использовать в качестве значений словаря: Map<String, Car>
    // что не умеем:
    // - использовать как элементы множества или как ключи словаря
    System.out.print("myCar: ");
    // для вызова метода мы пишем: имяОбъекта.метод(аргументы)
    myCar.printInfo();
    System.out.println("anotherCar: " + anotherCar.getInfo());

    System.out.println();
    // используем setPlate()
    myCar.setPlate("DE 234"); // задали номер - раньше его не было, было значение по умолчанию
    System.out.println("myCar: " + myCar.getInfo());
    anotherCar.setPlate("US 357"); // изменили номер - предыдущий задали при создании
    System.out.println("anotherCar: " + anotherCar.getInfo());

    System.out.println();
    System.out.println("Модель anotherCar: " + anotherCar.getModel());

    System.out.println();
    System.out.println("Car.minimalAge = " + Car.getMinimalAge());
    myCar.setDriverAge(15);
    System.out.println("myCar.driverAge = " + myCar.getDriverAge());
    System.out.println("anotherCar.driverAge = " + anotherCar.getDriverAge());

    System.out.println();
    Car.setMinimalAge(14); // для всех автомобилей вообще
    System.out.println("Car.minimalAge = " + Car.getMinimalAge());
    anotherCar.setDriverAge(15);
    System.out.println("myCar.driverAge = " + myCar.getDriverAge());
    System.out.println("anotherCar.driverAge = " + anotherCar.getDriverAge());
  }
}
