import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework17_3 {

  // На вход программе подается натуральное число `n` - количество чисел, а затем и сами числа,
  // каждое с новой строки.
  //
  // Напишите программу, которая прочитает эти числа, сохранит в массив,
  // а затем выведет только чётные элементы массива.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] numbers = new int[n];
//    numbers[0] = Integer.parseInt(br.readLine());
//    numbers[1] = Integer.parseInt(br.readLine());
//    ...
//    numbers[n - 1] = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; ++i) {
      numbers[i] = Integer.parseInt(br.readLine());
    }

    String result = "";
    for (int i = 0; i < n; ++i) {
      if (numbers[i] % 2 == 0) {
        result += ", " + numbers[i];
      }
    }
    if (!result.isEmpty()) { // если получившая строка не пустая
      result = result.substring(2); // убрали 2 первых символа - ", "
    }
    System.out.println(result);
  }
}
