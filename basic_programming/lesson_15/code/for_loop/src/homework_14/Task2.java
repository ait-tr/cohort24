package homework_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
  // В первый день спортсмен пробежал `s` километров,
  // а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
  // Определите номер дня, на который пробег спортсмена
  // составит не менее `target` километров.
  //
  // Программа получает на вход действительные числа `s` и `target` и должна вывести
  // одно натуральное число.
  final public static double DAILY_INC = 0.10;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double s = Double.parseDouble(br.readLine()); // дневной пробег в первый день
    double target = Double.parseDouble(br.readLine()); // целевой пробег
//    double distance = s; // пройденное расстояние в первый день
    int days = 1; // номер (первого = 1) дня

//    System.out.printf("Day: %d, Daily distance: %f%n", days, s);
    while (s < target) { // пока дневной пробег меньше целевого
      // пока общий пробег меньше целевого -- while (distance < target)
      // s = s + s * DAILY_INC; // пробег на новый день
      // s += s * DAILY_INC;
      // s = s * (1 + DAILY_INC);
      s *= 1 + DAILY_INC;
//      distance += s; // расстояние в конце нового дня
      ++days; // посчитали новый день
//      System.out.printf("Day: %d, Daily distance: %f%n", days, s);
    }
    System.out.println(days);
  }
}
