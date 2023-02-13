import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

  // для 4:
  // ****
  // ***
  // **
  // *
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите высоту треугольника: ");
    int height = Integer.parseInt(br.readLine());
    printTriangle(height);
  }

  public static void printTriangle(int height) {
    // Отладочный вывод -- вывод, которого не будет в готовом решении,
    // но с которым проще писать программу в процессе
    // Иногда такой вывод пишут в System.err - так делать не стоит
//    System.out.println("Здесь будет треугольник высотой " + height);
    for (int rowN = 0; rowN < height; ++rowN) {
      int length = height - rowN;
      System.out.println("Здесь будет строка номер " + rowN + " длиной " + length);
    }
  }
}
