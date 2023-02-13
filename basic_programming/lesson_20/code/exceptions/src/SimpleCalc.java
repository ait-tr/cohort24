import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalc {

  // - синтаксические ошибки - ошибка в служебном слове или операторе
  // Способ обнаружения: программа не запустится, пока не исправите
  // Реакция Java: невозможность выполнения

  // - стилистические ошибки
  // - стилистические/логические ошибки (в именах переменных, структуре, методах)
  // Способ обнаружения:
  // - часть исправляется Ctrl + Alt + L (Command + Option + L на Mac)
  // - код-ревью (от другого человека)
  // - рефакторинг (переделываете структуру программы - самостоятельно или в команде)
  // Реакция Java: НЕТ

  // - смысловые ошибки - ошибки программиста, компьютер ничего про них не знает (но иногда может
  // подсказать, если ошибка типичная):
  //   - неправильное условие
  //   - неправильные расчёты
  //   - потеря точности при преобразованиях - ошибки типа
  //   - бесконечный цикл
  //   (отслеживаемые ошибки):
  //   - деление на ноль
  //   - выход за границы массива / строки / etc.
  //   - падение тестов
  // Способ обнаружения: тесты - ручные и автоматические (юнит-тесты обычно пишет сам разработчик)
  // Реакция Java: прекращение работы, если в процессе работы возникла отслеживаемая ошибка

  // - ошибка пользователя или ошибка обработки данных
  //   - ошибка ввода, буквы вместо цифр
  //   - не тот файл, не та кодировка
  //   - ошибки по результатам ввода:
  //     - деление на ноль
  //     - выход за границы массива / строки / etc.
  // Способ обнаружения: тестирование и жалобы пользователей
  // Реакция Java: прекращение работы

  // - системные ошибки - зависят от компьютера, операционной системы и окружающей среды
  //   - stack overflow (не хватает оперативной памяти)
  //   - не хватает разрешения экрана
  // Способ обнаружения: тестирование и жалобы пользователей
  // Реакция Java: прекращение работы
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("== Деление двух чисел ==");
    System.out.print("Введите делимое: ");
    int a = Integer.parseInt(br.readLine());
    System.out.print("Введите делитель: ");
    int b = Integer.parseInt(br.readLine());
    System.out.println("Результат: " + a + " / " + b + " = " + divide(a, b));
  }

  public static int divide(int numerator, int denominator) {
    if (denominator == 0) {
      System.err.println("Делить на ноль нельзя!");
      // Сообщения об ошибках выводим не в System.out, а в System.err
      // Кроме сообщений об ошибках, в System.err ничего выводить нельзя!
      return -1; // какое-то число вместо ошибки
    }
    return numerator / denominator;
  }

  // Сообщение об ошибке:
  // Exception in thread "..." *.ТипИсключения: подробности ошибки
  // NumberFormatException - тип исключения - ошибочный формат числа
  // Exception in thread "main" java.lang.NumberFormatException: For input string: "2,9"
  //	at java.base/java.lang.Double.parseDouble(Double.java:735)
  //	at SimpleCalc.main(SimpleCalc.java:51)

  // StackTrace - след "стека" - след "стопочки вызовов методов" -
  // от самого первого (снизу) в глубину (наверх)
  // SimpleCalc.main(SimpleCalc.java:51) - Класс.метод(файл:строка)

  // ArithmeticException - арифметическая ошибка
  // Exception in thread "main" java.lang.ArithmeticException: / by zero
  //	at SimpleCalc.divide(SimpleCalc.java:58) // теперь это строка 64
  //	at SimpleCalc.main(SimpleCalc.java:54)
}
