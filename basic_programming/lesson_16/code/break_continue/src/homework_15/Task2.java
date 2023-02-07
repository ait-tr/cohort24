package homework_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int length = 1; length <= n; ++length) { // перебираем строки
      // length - длина строки
      for (int col = 1; col <= length; ++col) { // выводим строку
        // col -- "номер" звёздочки в строке (номер столбца): от 1 до length
        System.out.print("*");
      }
      System.out.println(); // переходим на новую строку
    }
  }
}
