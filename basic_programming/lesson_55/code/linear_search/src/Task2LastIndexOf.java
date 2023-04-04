import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2LastIndexOf {

  // Найти последнее (правое) вхождение положительного числа X.
  // Вывести индекс или -1, если число не встречалось.
  public static void main(String[] args) throws IOException { // O(n) - time, O(1) - space
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());
    int result = -1; // ответ "по умолчанию", если мы его не изменим

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " чисел, каждое с новой строки:");
    for (int i = 0; i < n; ++i) { // O(n) - time, O(1) - space
      int x = Integer.parseInt(br.readLine()); // O(1) - time, O(1) - space
      if (x == target) { // если число - нужное нам
        // i - наш ответ
        result = i; // нашли и изменили ответ, даже если он уже менялся
      }
    }

    System.out.println("Результат: " + result);
  }
}
