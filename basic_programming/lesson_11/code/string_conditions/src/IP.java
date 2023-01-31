import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IP {
  // Программа получает на вход IP-адрес в одну строку:
  // например, 192.168.23.1
  // (четыре числа, разделённые точками).
  // Каждое число должно быть в диапазоне от 0 до 255
  // Программа должна вывести эти четыре числа по отдельности,
  // каждое в новой строке, например:
  // 192
  // 168
  // 23
  // 1
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                            индексы: 0123456789
    String source = br.readLine(); // "192.168.23.1"
    //                                    ^ firstDot
    //                                        ^ secondDot
    //                                           ^ thirdDot
    // ищем точки - то есть символ '.'
    int firstDot = source.indexOf('.'); // 3
    int secondDot = source.indexOf('.', firstDot + 1); // начиная с 4 -- получится 7
    int thirdDot = source.indexOf('.', secondDot + 1); // начиная с 8 -- получится 10
    int extraDot = source.indexOf('.', thirdDot + 1); // начиная с 11, получится -1
    // extraDot -- лишняя точка, её быть не должно, и ничего найти indexOf не должен
    // получиться должен -1, раз ничего не нашли
    if (extraDot != -1) {
      // мы нашли лишнюю точку
      System.out.println("Неправильный формат IP-адреса: много точек");
      return; // условие-стражник
    }

    String byte1 = source.substring(0, firstDot); // с начала до первой точки,
    // первую точку не включая
    if (byte1.isEmpty()) {
      System.out.println("Неправильный формат IP-адреса: пустой первый байт");
      return;
    }
    int number1 = Integer.parseInt(byte1);
    if (number1 < 0) { // 00000000
      System.out.println("Неправильный формат IP-адреса: некорректный первый байт");
      return;
    }
    if (number1 > 255) { // 11111111
      System.out.println("Неправильный формат IP-адреса: некорректный первый байт");
      return;
    }
    // 256 = 100000000

    String byte2 = source.substring(firstDot + 1, secondDot); // с символа ПОСЛЕ первой точки
    // до второй точки, вторую точку не включая
    String byte3 = source.substring(secondDot + 1, thirdDot); // с символа ПОСЛЕ второй точки
    // до третьей точки, третью точку не включая
    String byte4 = source.substring(thirdDot + 1); // с символа ПОСЛЕ третьей точки
    // до конца

    System.out.println(byte1);
    System.out.println(byte2);
    System.out.println(byte3);
    System.out.println(byte4);
  }
}
