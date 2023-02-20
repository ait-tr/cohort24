import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1_1 {

  // прочитать список чисел и определить количество уникальных чисел в нём
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(5);
    numbers.add(7);
    numbers.add(5);
    numbers.add(9);
    System.out.println("Список чисел: " + numbers);
    System.out.println("Уникальных чисел в этом списке: " + uniqueAmount(numbers));
  }

  public static int uniqueAmount(List<Integer> list) {
    Set<Integer> temp = new HashSet<>();
    for (int element : list) {
      temp.add(element);
    }
    return temp.size();
  }
}
