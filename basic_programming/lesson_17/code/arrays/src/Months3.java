import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months3 {
  // Программа получает на вход натуральное число от 1 до 12 включительно
  // Программа должна вывести название месяца и количество дней в нём (в невисокосный год)

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 0 месяца не бывает -- начинаем с 1, а 0 оставляем пустым
    String[] monthNames = {null, "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"};

    int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int monthNo = Integer.parseInt(br.readLine());
    System.out.println(monthNames[monthNo]);
    System.out.println(monthDays[monthNo]);
  }
}
