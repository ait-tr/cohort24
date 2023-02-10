import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
  // Пирожок в столовой стоит a рублей и b копеек.
  // Определите, сколько рублей и копеек нужно заплатить за n пирожков.
  //
  // Программа получает на вход три числа: a, b, n,
  // и должна вывести два числа: стоимость покупки в рублях и копейках.

  // Пример ввода:
  // 2
  // 50
  // 4
  // Пример вывода:
  // 10 0
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int priceK = a * 100 + b;
    int total = priceK * n;
    System.out.println(total / 100 + " " + total % 100);
  }
}
