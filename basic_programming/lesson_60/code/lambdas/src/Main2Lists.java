import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2Lists {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 7, 3, 9, 5));

    System.out.println("numbers = " + numbers);
    // перед binarySearch надо сделать sort
    Collections.sort(numbers); // На самом деле он вызовет numbers.sort(null),
    // где null вместо компаратора
    System.out.println("numbers = " + numbers);

    System.out.print("Введите число для поиска: ");
    int x = Integer.parseInt(bufferedReader.readLine());

    int i = Collections.binarySearch(numbers, x);
    if (i < 0) {
      System.out.println("Число не найдено");
      // i = -(insertionPoint) - 1
      // i + 1 = -(insertionPoint)
      // -(i + 1) = insertionPoint
      int insertionPoint = -(i + 1);
      System.out.println("Оно бы стояло под индексом " + insertionPoint);
    } else {
      System.out.println("Число найдено");
      System.out.println("Оно стоит под индексом " + i + ": " + numbers.get(i));
    }
  }
}
