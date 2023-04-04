import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Utils {

  // При расчёте сложности:
  // выражения в скобках у O замечательно складываются и умножаются
  // из полученного выражения выбрасываются "младшие" слагаемые - остаётся только самая
  // "большая" функция (большая - значит, на графике она выше)
  // после этого выбрасываются все числовые множители (50 * 3 * n^2 --> n^2)
  // выражение T(n) относится к группе O(f(n)), если существует число c, такое, что
  // T(n) < c * f(n) для больших n

  // O(5 + n + 1) = O(n + 6) = O(n)
  public static List<Integer> readList() throws IOException {
    List<Integer> result = new ArrayList<>(); // O(1)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // O(1)

    System.out.print("Введите количество чисел: "); // O(1)
    int n = Integer.parseInt(br.readLine()); // O(1)
    System.out.println("Введите " + n + " чисел, каждое с новой строки:"); // O(1)
    for (int i = 0; i < n; ++i) { // O((1 + 1) * n) = O(2 * n) = O(n)
      int x = Integer.parseInt(br.readLine()); // O(1)
      result.add(x); // O(1)
    }

    return result; // O(1)
  }
}
