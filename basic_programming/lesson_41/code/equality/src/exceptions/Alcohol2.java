package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alcohol2 {

  static int legalAge;

  public static void printUsage() {
    System.out.println("При запуске программе нужно указать возраст");
    System.out.println("Использование: Alcohol n");
    System.out.println("Указанное значение (целое число n) будет использовано как legal age");
    // в квадратных скобках в примерах использования указываются опциональные ключи
    // при запуске квадратные скобки не пишут
    System.exit(0); // завершение ВСЕЙ программы
    // попросили помощи - вывели помощь и завершили программу
    // в следующий раз её запустят "правильно"
  }

  public static void parseArguments(String[] args) {
    if (args.length != 1) {
      System.err.println("Некорректное использование!");
      printUsage(); // после этого программа завершится
    }
    try {
      legalAge = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      System.err.println("Некорректное использование: " + e.getMessage());
      printUsage(); // после этого программа завершится
    }
  }

  public static void drink(int age) throws IllegalAge {
    if (age < legalAge) {
      throw new IllegalAge(age);
    }
  }

  public static void main(String[] args) throws IOException {
    parseArguments(args);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите возраст: ");
    int age = Integer.parseInt(br.readLine());

    try {
      drink(age);
    } catch (IllegalAge e) {
      System.err.println("Вам ничего нельзя: " + e.getMessage());
      return;
    }

    System.out.println("Вам всё можно!");
  }
}
