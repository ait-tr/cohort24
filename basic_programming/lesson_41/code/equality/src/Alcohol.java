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
    if (args.length > 0) {
      System.out.println("У нас есть аргументы!");

      for (String argument : args) {
        if (argument.startsWith("--age=")) {
          System.out.println("У нас есть параметр 'age'!");
          String value = argument.substring("--age=".length()); // отрежем в начале "--age="
          legalAge = Integer.parseInt(value);
        }

        if (argument.equals("--help")) {
          System.out.println("У нас есть параметр 'help'!");
          printUsage();
        }
      }

      System.out.println("legalAge = " + legalAge);
    } else {
      System.out.println("Нет дополнительных аргументов, legalAge = " + legalAge);
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
