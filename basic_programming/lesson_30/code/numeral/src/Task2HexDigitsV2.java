import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2HexDigitsV2 {

  final public static String HEX_DIGITS = "0123456789ABCDEF";
  final public static char[] HEX_DIGITS_2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'A', 'B', 'C', 'D', 'E', 'F'};

  // перебрать и напечатать в столбик шестнадцатеричные (hexadecimal) цифры числа
  public static String DecToHex(int number) {
    String result = "";
    while (number > 0) { // пока цифры есть
      int digit = number % 16;
      char toPrint = HEX_DIGITS.charAt(digit);
//      char toPrint = HEX_DIGITS_2[digit];
      System.out.println("Цифра: " + toPrint);
      result = toPrint + result;
      number /= 16;
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите число: ");
    int x = Integer.parseInt(br.readLine());
    System.out.println(DecToHex(x));
  }
}
