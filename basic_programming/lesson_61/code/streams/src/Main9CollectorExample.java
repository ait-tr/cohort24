import java.util.Arrays;
import java.util.stream.Collectors;

public class Main9CollectorExample {

  public static void main(String[] args) {
    int[] numbers = new int[]{3, 25, 2, -4, 13};
    printArray(numbers);
  }

  public static void printArray(int[] numbers) {
//    System.out.print("[");
//    for (int i = 0; i < numbers.length - 1; ++i) {
//      System.out.print(numbers[i] + ", ");
//    }
//    System.out.print(numbers[numbers.length - 1]);
//    System.out.println("]");

    System.out.println(
        Arrays.stream(numbers)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(", ", "[", "]"))
    );
  }
}
