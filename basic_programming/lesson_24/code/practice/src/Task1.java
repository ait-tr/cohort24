import java.util.ArrayList;
import java.util.List;

public class Task1 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int x = 1; x <= 5; ++x) {
      numbers.add(x);
    }
    printList(numbers);
  }

  public static void printList(List<Integer> list) {
    // печатает список через пробел в одну строку (с завершением строки без лишних пробелов)
    for (int i = 0; i < list.size(); ++i) {
      if (i == list.size() - 1) {
        System.out.println(list.get(i));
      } else {
        System.out.print(list.get(i) + " ");
      }
    }
  }

  public static void printArray(int[] array) {
    // печатает массив через пробел в одну строку (с завершением строки без лишних пробелов)
    for (int i = 0; i < array.length; ++i) {
      if (i == array.length - 1) {
        System.out.println(array[i]);
      } else {
        System.out.print(array[i] + " ");
      }
    }
  }
}
