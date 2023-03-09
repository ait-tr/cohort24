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

    if (!check()) {
      System.out.println("Такого треугольника не бывает: " + sideA + ", " + sideB + ", " + sideC);
    }
  }

  private static boolean checkMainSide(int main, int left, int right) {
    return main < LessonMain.sum(left, right); // сторона меньше суммы двух других
  }

  private boolean check() {
    if (!checkMainSide(sideA, sideB, sideC)) {
      return false;
    }
    if (!checkMainSide(sideB, sideA, sideC)) {
      return false;
    }
    if (!checkMainSide(sideC, sideA, sideB)) {
      return false;
    }
    return true;
  }
}
