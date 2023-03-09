// При провале любой из проверок нужно вывести на экран соответствующее сообщение.
public class LessonTriangle {

  private int sideA;
  private int sideB;
  private int sideC;

  // "Метод-стражник" - вернёт то, что пройдёт проверку.
  // private методы - методы, не доступные снаружи,
  // их можно использовать только внутри класса.
  // Если класс - это чертёж, а объект - это "чёрный ящик", то
  // публичные методы - это кнопки и экраны, а
  // приватные методы - контакты внутри ящика между его компонентами
  static int checkSide(int side) {
    if (side <= 0) {
      throw new IllegalArgumentException("Сторона должна быть положительной: " + side); // ошибка
    }
    return side; // вернул сторону, прошедшую проверку
  }

  // Создайте класс `Triangle` (треугольник), принимающий три целых значения - длины трёх сторон
  // треугольника.
  public LessonTriangle(int sideA, int sideB, int sideC) {
    // В конструкторе нужно проверить введённые значения на корректность
    // (например, длины не могут быть отрицательными).
    this.sideA = checkSide(sideA);
    this.sideB = checkSide(sideB);
    this.sideC = checkSide(sideC);

    check();
  }

  private static void checkMainSide(int main, int left, int right) {
    if (main >= LessonMain.sum(left, right)) {
      throw new IllegalArgumentException(
          String.format("Некорректные стороны: %d > %d + %d", main, left, right));
    }
    // сторона меньше суммы двух других
  }

  private void check() {
    checkMainSide(sideA, sideB, sideC);
    checkMainSide(sideB, sideA, sideC);
    checkMainSide(sideC, sideA, sideB);
  }
}
