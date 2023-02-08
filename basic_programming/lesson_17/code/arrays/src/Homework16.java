import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework16 {
  // На вход программе подается натуральное число `n`. Напишите программу, которая выводит числа
  // от 1 до `n` включительно за исключением чисел от `5` до `19` включительно.
  //
  // Формат входных данных
  // На вход программе подается одно натуральное число `n`.
  //
  // Формат выходных данных
  // Программа должна вывести числа в соответствии с условием задачи, каждое на отдельной строке.
  //
  // Примечание
  // Используйте оператор `continue`!

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int x = 1; x <= n; ++x) {
      if (5 <= x && x <= 19) { // эти числа нам не нужны!
        continue; // пропускаем их
      }
      System.out.println(x);
    }
  }
}
