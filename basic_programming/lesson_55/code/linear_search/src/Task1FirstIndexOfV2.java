import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1FirstIndexOfV2 {

  // Найти первое (левое) вхождение положительного числа X.
  // Вывести индекс или -1, если число не встречалось.
  public static void main(String[] args) throws IOException { // O(n) - time
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> numbers = new ArrayList<>(); // O(1)

    System.out.print("Введите количество чисел: "); // O(1)
    int n = Integer.parseInt(br.readLine()); // O(1)
    System.out.println("Введите " + n + " чисел, каждое с новой строки:"); // O(1)
    for (int i = 0; i < n; ++i) { // O((1 + 1) * n) = O(2 * n) = O(n)
      int x = Integer.parseInt(br.readLine()); // O(1)
      numbers.add(x); // O(1)
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    int result = -1; // ответ "по умолчанию", если мы его не изменим
    for (int i = 0; i < numbers.size(); ++i) { // O(n)
      if (numbers.get(i) == target) { // O(1)
        // i - наш ответ
        result = i; // нашли и изменили ответ
      }
    }
    // если мы дошли до этого места, то мы не нашли число target
    if (result != -1) {
      System.out.println("numbers[" + result + "] = " + numbers.get(result)); // O(1)
    } else {
      System.out.println("Число не найдено");
    }
  }
}
