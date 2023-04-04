import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4PreRLE {

  // Run-length encoding (RLE) (aaabbcddddaaaaa = a3b2cd4a5)
  // Промежуточная задача - PreRLE - убрать повторяющиеся подряд символы
  // (aaabbcddddaaaaa = abcda)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия:");
    String input = br.readLine();
    String result = "";

    Character prev = null; // предыдущий символ, в начале он null - его нет
    for (int i = 0; i < input.length(); ++i) {
      Character c = input.charAt(i); // текущий символ
      if (/*prev == null || */!c.equals(prev)) { // если текущий не совпадает с предыдущим
        result += c; // записываем текущий (не совпадающий) в результат
        prev = c;
      }
    }

    System.out.println("Промежуточный результат сжатия:");
    System.out.println(result);
  }
}
