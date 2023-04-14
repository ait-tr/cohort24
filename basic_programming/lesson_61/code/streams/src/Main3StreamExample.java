import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3StreamExample {

  public static void main(String[] args) {
    // создание
    List<Integer> numbers = List.of(1, 5, 3, 2, 4);
    System.out.println("Список квадратов чисел из потока:");
    String result = numbers.stream()                  // создание
        .sorted()                                     // cортировка
        .map(x -> x * x)                              // возведение в квадрат
        .filter(Main3StreamExample::isEven)           // фильтрация "только чётные"
        .map(Object::toString)                        // превращение в строки
        .collect(Collectors.joining(", "));   // потребление - объединение через запятую
    System.out.println(numbers);
    System.out.println(result);
  }

  public static boolean isEven(int x) {
    return x % 2 == 0;
  }

  public static void strangePrint(int x) {
    System.out.println("-=" + x + "=-");
  }
}
