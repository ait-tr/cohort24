package homework_36;

// При провале любой из проверок нужно вывести на экран соответствующее сообщение.
public class Triangle {
  private int a, b, c;

  // Создайте класс `Triangle` (треугольник), принимающий три целых значения - длины трёх сторон
  // треугольника.
  public Triangle(int a, int b, int c) {
    // В конструкторе нужно проверить введённые значения на корректность
    // (например, длины не могут быть отрицательными).
    if (a > 0) {
      this.a = a;
    } else {
      System.out.println("Сторона должна быть положительной: " + a); // в this.a останется 0
    }

    if (b > 0) {
      this.b = b;
    } else {
      System.out.println("Сторона должна быть положительной: " + b); // в this.b останется 0
    }

    if (c > 0) {
      this.c = c;
    } else {
      System.out.println("Сторона должна быть положительной: " + c); // в this.a останется 0
    }

    if (!checkSides(a, b, c)) {
      System.out.println("Такого треугольника не бывает: " + a + ", " + b + ", " + c);
    }
  }

  // В классе должен быть описан отдельный статический метод
  // `public static boolean checkSides(int a, int b, int c)`,
  // который должен проверить неравенство треугольника.
  // Этот метод необходимо использовать в конструкторе.
  public static boolean checkSides(int a, int b, int c) {
    if (a >= b + c) {
      return false;
    }
    if (b >= a + c) {
      return false;
    }
    if (c >= a + b) {
      return false;
    }
    return true;
  }
}
