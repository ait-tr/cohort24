import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalc1 {

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
    try { // пытаемся выполнить команды, которые могут привести к ошибке
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("== Деление двух чисел ==");
      System.out.print("Введите делимое: ");
      int a = Integer.parseInt(br.readLine());
      System.out.print("Введите делитель: ");
      int b = Integer.parseInt(br.readLine());
      System.out.println("Результат: " + a + " / " + b + " = " + divide(a, b));
    } catch (NumberFormatException e) {
      // ловим исключение типа NumberFormatException в переменную `e`
      System.err.println("Некорректный формат номера! " + e.getMessage());
    } catch (ArithmeticException e) {
      // ловим исключение типа ArithmeticException в переменную `e`
      System.err.println("Делить на ноль нельзя! " + e.getMessage());
    }
  }

  public static int divide(int numerator, int denominator) {
    return numerator / denominator;
  }
}
