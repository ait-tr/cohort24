import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

  // для 4:
  // ****
  // ***
  // **
  // *
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите высоту треугольника: ");
    try {
      int height = Integer.parseInt(br.readLine());
      printTriangle(height);
    } catch (NumberFormatException e) {
      System.out.println("Некорректная высота треугольника: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Ошибка ввода: " + e.getMessage());
    }
  }

  public static void printTriangle(int height) {
    for (int rowN = 0; rowN < height; ++rowN) {
      int length = height - rowN;
      for (int colN = 0; colN < length; ++colN) { // повтори length раз
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
