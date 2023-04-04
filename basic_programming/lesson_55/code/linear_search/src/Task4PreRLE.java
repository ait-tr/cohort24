import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4PreRLE {

  // Run-length encoding (RLE) (aaabbcddddaaaaa = a3b2cd4a5)
  // Промежуточная задача - PreRLE - убрать повторяющиеся подряд буквы
  // (aaabbcddddaaaaa = abcda)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия:");
    String input = br.readLine();
    String result = "";

    // TODO

    System.out.println("Промежуточный результат сжатия:");
    System.out.println(result);
  }
}
