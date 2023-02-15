import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_21 {

  // Исключения:
  // *.parse*() (Integer.parseInt() и т.д.) -- NumberFormatException - неправильный формат числа
  // массив[индекс] - ArrayIndexOutOfBoundsException - индекс за границами массива
  // new тип[размер] - NegativeArraySizeException - отрицательный размер массива
  public static void main(String[] args) throws IOException {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine()); // NumberFormatException
      String[] names = new String[n]; // NegativeArraySizeException
      for (int i = 0; i < n; ++i) {
        names[i] = br.readLine(); // безопасно, потому что мы сами задали i
      }
      int numToPrint = Integer.parseInt(br.readLine()); // NumberFormatException
      int iToPrint = numToPrint - 1;

      System.out.println(names[iToPrint]); // ArrayIndexOutOfBoundsException
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат ввода: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Номер за границами списка");
    } catch (NegativeArraySizeException e) {
      System.err.println("Отрицательный размер списка: " + e.getMessage());
    }
  }
}
