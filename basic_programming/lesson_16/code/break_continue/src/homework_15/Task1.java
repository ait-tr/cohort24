package homework_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
  // Даны два целых числа: `m` и `n` (m > n).
  // Напишите программу, которая выводит все нечётные числа от `m` до `n` включительно
  // в порядке убывания.

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    for (int num = m; num >= n; --num) { // в порядке убывания
      if (num % 2 != 0) { // нечётные
        System.out.println(num);
      }
    }
  }
}
