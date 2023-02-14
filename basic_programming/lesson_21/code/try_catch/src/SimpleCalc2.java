import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalc2 {

  //   (отслеживаемые ошибки):
  //   - деление на ноль
  //   - выход за границы массива / строки / etc.
  //   - падение тестов
  // Реакция Java: прекращение работы, если в процессе работы возникла отслеживаемая ошибка

  // - ошибка пользователя или ошибка обработки данных
  //   - ошибка ввода, буквы вместо цифр
  //   - не тот файл, не та кодировка
  //   - ошибки по результатам ввода:
  //     - деление на ноль
  //     - выход за границы массива / строки / etc.
  // Реакция Java: прекращение работы

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("== Деление двух чисел ==");

    System.out.print("Введите делимое: ");
    int a;
    try {
      a = Integer.parseInt(br.readLine());
    } catch (NumberFormatException e) {
      System.out.println("Некорректный формат номера для делимого! " + e.getMessage());
      a = 1;
      System.out.println("Устанавливаем делимое, равное " + a);
    }

    System.out.print("Введите делитель: ");
    int b;
    try {
      b = Integer.parseInt(br.readLine());
    } catch (NumberFormatException e) {
      System.out.println("Некорректный формат номера для делителя! " + e.getMessage());
      b = 1;
      System.out.println("Устанавливаем делитель, равный " + b);
    }

    System.out.println("Результат: " + a + " / " + b + " = " + divide(a, b));
  }

  public static int divide(int numerator, int denominator) {
    try {
      return numerator / denominator;
    } catch (ArithmeticException e) {
      System.out.println("Делить на ноль нельзя! " + e.getMessage());
      return 0;
    }
  }
}
