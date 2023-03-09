import homework_36.Soda;

class LessonMain {

  // Модификаторы доступа (access modifiers) применимы к атрибутам и методам:
  // 1. private - доступны ТОЛЬКО внутри класса - только внутри файла
  // 2. (default) (если ничего не написать) - доступно всем внутри пакета
  //    - только внутри одной папки (не в подпапках), можно в разных файлах
  //    - например, "внутренние" библиотечные функции
  // 3. protected - доступно всем внутри пакета (как default)
  //    и вне пакета доступен потомкам (наследникам) (будет отдельной темой)
  //    (без учёта потомков - то же самое, что и default - значит, пока мы protected не используем)
  // 4. public - доступны отовсюду (из любых папок и при любом import)
  //    - например, библиотечные функции и методы Java

  // Когда какой использовать:
  // - метод только для нас, только внутри одного файла (например, Triangle.checkSide())
  //   - private
  // - метод только для нас, во всём пакете (во всём проекте)
  //   (например, readArray из прошлых уроков) - ничего не пишем
  //   - default
  // - метод должен быть доступен всем и везде, если написали import - это часть "интерфейса",
  //   часть "кнопочек" и "экранов" нашего "чёрного ящика"
  //   (например, конструкторы, большинство геттеров и сеттеров)
  //   - public

  // ВСЕ ПАКЕТЫ - САМОСТОЯТЕЛЬНЫЕ
  // даже если одна папка лежит в другой
  // есть иерархия в именах, но доступу это НЕ ПОМОГАЕТ
  public static void main(String[] args) {
    Soda firstGlassOfSoda = new Soda(null);
    System.out.println(firstGlassOfSoda.getMyDrinkString());

    try {
      LessonTriangle triangle1 = new LessonTriangle(-1, -2, -5);
    } catch (IllegalArgumentException e) {
      System.out.println("Не получилось создать треугольник: " + e.getMessage());
    }

    try {
      LessonTriangle triangle2 = new LessonTriangle(1, 2, 5);
    } catch (IllegalArgumentException e) {
      System.out.println("Не получилось создать треугольник: " + e.getMessage());
    }

    LessonTriangle triangle3 = new LessonTriangle(3, 4, 5);
  }

  protected static int sum(int a, int b) {
    return a + b;
  }
}
