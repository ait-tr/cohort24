import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2StreamExample {

  public static void main(String[] args) {
    // создание
    int[] numbers = /*new int[]*/{1, 5, 3, 2, 4};
    System.out.println("Список квадратов чисел из потока:");
    String result = Arrays.stream(numbers)            // создание
        .sorted()                                     // cортировка
        .map(x -> x * x)                              // возведение в квадрат
        .filter(Main2StreamExample::isEven)           // фильтрация "только чётные"
        .mapToObj(Integer::toString)                  // превращение в строки
        .collect(Collectors.joining(", "));   // потребление - объединение через запятую
    System.out.println(result);
  }

  public static boolean isEven(int x) {
    return x % 2 == 0;
  }

  public static void strangePrint(int x) {
    System.out.println("-=" + x + "=-");
  }
}
