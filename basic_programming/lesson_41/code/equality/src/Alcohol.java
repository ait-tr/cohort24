import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alcohol {

  static int legalAge = 18;

  public static void printUsage() {
    System.out.println("При запуске программе можно указать опциональный ключ 'age'");
    System.out.println("Использование: Alcohol [--age=n]");
    System.out.println("Указанное значение (целое число n) будет использовано как legal age");
    // в квадратных скобках в примерах использования указываются опциональные ключи
    // при запуске квадратные скобки не пишут
    System.exit(0); // завершение ВСЕЙ программы
    // попросили помощи - вывели помощь и завершили программу
    // в следующий раз её запустят "правильно"
  }

  public static void parseArguments(String[] args) {
    for (String argument : args) { // если аргументов нет, то метод тут же завершится
      if (argument.startsWith("--age=")) {
        String value = argument.substring("--age=".length()); // отрежем в начале "--age="
        legalAge = Integer.parseInt(value);
      } else if (argument.equals("--help")) {
        printUsage(); // после этого программа завершится
      } else {
        System.err.println("Некорректный аргумент: " + argument);
        printUsage(); // после этого программа завершится
      }
    }
  }

  public static void main(String[] args) throws IOException {
    parseArguments(args);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите возраст: ");
    int age = Integer.parseInt(br.readLine());

    if (age < legalAge) {
      System.out.println("Вам ничего нельзя!");
    } else {
      System.out.println("Вам всё можно!");
    }
  }
}
