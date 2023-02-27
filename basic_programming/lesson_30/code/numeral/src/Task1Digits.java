import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Digits {

  // распечатать в столбик все цифры числа number, начиная с последней
  public static void printDigits(int number) {
    if (number == 0) {
      System.out.println(0);
      return;
    }
    while (number > 0) { // пока в числе ЕСТЬ цифры
      // последняя цифра - остаток от деления числа на основание системы счисления
      int digit = number % 10; // остаток от деления number на 10
      System.out.println(digit);
//      number = number / 10; // целая часть от деления number на 10
      number /= 10;
//      System.out.println("Все остальные цифры: " + number);
    }
  }

  // напечатать цифры в столбик и посчитать количество цифр
  public static int countDigits(int number) {
    // corner-case - частный случай
    if (number == 0) {
      System.out.println(0);
      return 1; // число 0 состоит из одной цифры
    }

    if (number < 0) {
      System.out.println("Отрицательное число");
      number = Math.abs(number); // превращаем отрицательное число в положительное
    }

    int counter = 0;
    while (number > 0) { // пока в числе ЕСТЬ цифры
      System.out.println(number % 10);
      number /= 10; // целая часть от деления number на 10
      ++counter;
    }
    return counter;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите число: ");
    int x = Integer.parseInt(br.readLine());
    System.out.println("Цифр в нём: " + countDigits(x));
//    printDigits(x);
  }
}
