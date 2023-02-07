import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplying {
//  Дано натуральное число `n`. Напишите программу, которая выводит таблицу умножения на `n`.
//  Пример вывод для `n` = 5:
//  5 x 1 = 5
//  5 x 2 = 10
//  5 x 3 = 15
//  5 x 4 = 20
//  5 x 5 = 25
//  5 x 6 = 30
//  5 x 7 = 35
//  5 x 8 = 40
//  5 x 9 = 45
//  5 x 10 = 50

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int a = 1; a <= 10; ++a) {
//      System.out.println(n + " x " + a + " = " + (n * a));
      System.out.printf("%d x %d = %d%n", n, a, n * a);
    }
  }
}
