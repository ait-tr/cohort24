import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1_2 {

  // прочитать список чисел и определить количество уникальных чисел в нём
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(3);
    numbers.add(5);
    numbers.add(7);
    numbers.add(5);
    numbers.add(9);
    System.out.println("Уникальных чисел в этом списке: " + numbers.size());
  }
}
