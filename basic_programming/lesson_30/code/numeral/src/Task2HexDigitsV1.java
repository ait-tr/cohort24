import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2HexDigitsV1 {

  // перебрать и напечатать в столбик шестнадцатеричные (hexadecimal) цифры числа
  public static String DecToHex(int number) {
    String result = "";
    while (number > 0) { // пока цифры есть
      int digit = number % 16;
      String toPrint;
      switch (digit) {
        case 15:
          toPrint = "F";
          break;
        case 14:
          toPrint = "E";
          break;
        case 13:
          toPrint = "D";
          break;
        case 12:
          toPrint = "C";
          break;
        case 11:
          toPrint = "B";
          break;
        case 10:
          toPrint = "A";
          break;
        default:
          toPrint = "" + digit;
          break;
      }
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
