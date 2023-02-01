import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Приоритет логических операций:
// сначала НЕ - !
// потом И - &&
// потом ИЛИ - ||
public class LeapYearLogical {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // год, который делится на 4 -- високосный
    // 2020, 2024 -- високосный
    // но при этом год, который делится на 100 -- не високосный
    // 1900, 2100 -- не високосный
    // но при этом год, который делится на 400 -- високосный
    // 1600, 2000, 2400 -- високосный

    // год, который "делится на 4 и не делится на 100" или "делится на 400"

    System.out.print("Введите год: ");
    int year = Integer.parseInt(br.readLine());
    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
      System.out.println(year + " -- високосный год!");
    } else {
      System.out.println(year + " -- не високосный год!");
    }
    // не делится на 100:
    // (year % 100 != 0)
    // !(year % 100 == 0)
  }
}
