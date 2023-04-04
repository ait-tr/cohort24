import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5RLE {

  // Run-length encoding (RLE) (aaabbcddddaaaaa = a3b2cd4a5)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия:");
    String input = br.readLine();
    StringBuilder result = new StringBuilder(); // класс для "изменяемых строк", почти коллекция

    Character prev = null; // предыдущий символ, в начале он null - его нет
    for (int i = 0; i < input.length(); ++i) {
      Character c = input.charAt(i); // текущий символ
      if (/*prev == null || */!c.equals(prev)) { // если текущий не совпадает с предыдущим
        result.append(c); // записываем текущий (не совпадающий) в результат
        prev = c;
        // String += String / char -- O(n) для ОДНОГО сложения
        // StringBuilder.append - O(1)
      }
    }

    System.out.println("Промежуточный результат сжатия:");
    System.out.println(result/*.toString()*/);
  }
}
