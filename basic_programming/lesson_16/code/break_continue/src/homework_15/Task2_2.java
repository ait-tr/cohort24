package homework_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int length = 1; length <= n; ++length) {
      // length - длина строки
      for (int i = 0; i < length; ++i) { // выводим строку
        // i -- "индекс" звёздочки в строке: от 0 до (length - 1)
        System.out.print('*');
      }
      System.out.println(); // переходим на новую строку
    }
  }
}
