import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = {1, 3, 5};

    System.out.print("Введите число для поиска: ");
    int x = Integer.parseInt(bufferedReader.readLine());

    int i = Arrays.binarySearch(numbers, x);
    if (i < 0) {
      System.out.println("Число не найдено");
      // i = -(insertionPoint) - 1
      // i + 1 = -(insertionPoint)
      // -(i + 1) = insertionPoint
      int insertionPoint = -(i + 1);
      System.out.println("Оно бы стояло под индексом " + insertionPoint);
    } else {
      System.out.println("Число найдено");
      System.out.println("Оно стоит под индексом " + i + ": " + numbers[i]);
    }
  }
}
