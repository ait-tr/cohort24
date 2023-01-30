import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework9_1 {
  // Напишите программу, в которой пользователь вводит с клавиатуры целое число, а программа ему
  // рассказывает, отрицательное это число, положительное или ноль, и делится ли оно на три.
  //
  // Использовать `if ... else` и из трёх вариантов (отрицательное, положительное или ноль)
  // вывести только один.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());

    if (number < 0) {
      System.out.printf("Число %d - отрицательное%n", number);
    } else if (number > 0) {
      System.out.printf("Число %d - положительное%n", number);
    } else { // не меньше (см. строку 16) и не больше (см. строку 18), значит, равно нулю
      System.out.printf("Число %d - ноль%n", number);
    }

    if (number % 3 == 0) {
      System.out.printf("Число %d делится на три%n", number);
    } else {
      System.out.println("Число " + number + " НЕ делится на три");
    }
  }
}
