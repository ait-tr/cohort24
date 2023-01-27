import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // год, который делится на 4 -- високосный
    // 2020, 2024 -- високосный
    // но при этом год, который делится на 100 -- не високосный
    // 1900, 2100 -- не високосный
    // но при этом год, который делится на 400 -- високосный
    // 1600, 2000, 2400 -- високосный

    System.out.print("Введите год: ");
    int year = Integer.parseInt(br.readLine());

    // Много вложенных условий
    // НЕ НАДО ТАК ДЕЛАТЬ
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println(year + " -- високосный год!");
        } else {
          System.out.println(year + " -- не високосный год!");
        }
      } else {
        System.out.println(year + " -- високосный год!");
      }
    } else {
      System.out.println(year + " -- не високосный год!");
    }


  }
}
