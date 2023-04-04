import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3FirstIndexOfMax {

  // Найти максимальное число в последовательности.
  // Вывести индекс.
  public static void main(String[] args) throws IOException { // O(n) - time, O(1) - space
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " чисел, каждое с новой строки:");
    // выносим первый шаг из цикла (для i == 0)
    int result = 0;
    int max = Integer.parseInt(br.readLine()); // прочитанное число и будет максимумом
    for (int i = 1; i < n; ++i) { // n - 1 шагов // O(n - 1) = O(n) - time, O(1) - space
      int x = Integer.parseInt(br.readLine()); // O(1) - time, O(1) - space
      if (x > max) { // если новое число больше найденного максимума,
        // то именно оно - новый максимум
        max = x; // запоминаем само число - с ним мы сравниваем
        result = i; // запоминаем индекс - он нам нужен по условию задачи
      }
    }

    System.out.println("Результат: " + result);
  }
}
