import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1Arrays {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = {1, 7, 3, 9, 5};
    // в Java массив - это ссылочный тип, поэтому ссылка выделяется на стеке (stack),
    // а сами данные - в куче (heap)

    System.out.println("numbers = " + Arrays.toString(numbers));
    Arrays.sort(numbers); // перед binarySearch надо сделать sort
    System.out.println("numbers = " + Arrays.toString(numbers));

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
