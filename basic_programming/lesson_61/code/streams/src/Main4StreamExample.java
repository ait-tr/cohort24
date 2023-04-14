import java.util.List;
import java.util.stream.Collectors;

public class Main4StreamExample {

  public static void main(String[] args) {
    // создание
    List<Integer> numbers = List.of(1, 5, 3, 2, 4);
    System.out.println("Список квадратов чисел из потока:");
    int result = numbers.stream()                     // создание
        .map(x -> x * x)                              // возведение в квадрат
        .filter(x -> x % 2 != 0)                      // фильтрация "только нечётные"
        .mapToInt(Integer::intValue)                  // Integer -> int
        .sum();   // потребление - сумма
    System.out.println(numbers);
    System.out.println("Сумма нечётных квадратов: " + result);
  }
}
