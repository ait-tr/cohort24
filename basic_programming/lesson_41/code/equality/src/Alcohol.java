import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alcohol {

  static int legalAge = 18;

  public static void main(String[] args) throws IOException {
    if (args.length > 0) {
      System.out.println("У нас есть аргументы!");

      for (String argument : args) {
        if (argument.startsWith("--age=")) {
          System.out.println("У нас есть параметр 'age'!");
          String value = argument.substring("--age=".length()); // отрежем в начале "--age="
          legalAge = Integer.parseInt(value);
        }
      }

      System.out.println("legalAge = " + legalAge);
    } else {
      System.out.println("Нет дополнительных аргументов, legalAge = " + legalAge);
    }

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
