import java.util.ArrayList;
import java.util.List;

public class Homework59MergeSort {

  public static List<String> sort(List<String> lines) {
    if (lines.size() < 2) { // пустой список или список из одного элемента уже отсортирован
      return lines; // возвращаем его, как есть
    }

    // разбить на две половинки
    int mid = lines.size() / 2;
    List<String> left = lines.subList(0, mid);
    List<String> right = lines.subList(mid, lines.size());
    // O(n) дополнительной памяти, O(n) по времени (копирование массива)
    // O(1) дополнительной памяти, O(1) по времени (для связных списков при другой реализации)

    System.out.println("=== sort(" + lines + ") ===");
    System.out.println("left = " + left);
    System.out.println("right = " + right);

    // отсортировать каждую
    left = sort(left);
    right = sort(right);

    // слить две половинки
    return merge(left, right);
  }

  /**
   * Слияние двух отсортированных по возрастанию списков в один
   *
   * @param list1 отсортированный по возрастанию список строк
   * @param list2 отсортированный по возрастанию список строк
   * @return отсортированный по возрастанию итоговый список строк после слияния
   */
  private static List<String> merge(List<String> list1, List<String> list2) {
    // O(n) дополнительной памяти (или O(1) для связных списков при другой реализации)
    // O(n * k) по времени
    System.out.println("=== merge(" + list1 + ", " + list2 + ") ===");
    List<String> result = new ArrayList<>();
    int i1 = 0;
    int i2 = 0;

    while (i1 < list1.size() && i2 < list2.size()) {
      // пока оба списка не закончились
      String first = list1.get(i1);
      String second = list2.get(i2);
      // O(k), где k - максимальная длина строки
      if (first.compareTo(second) < 0) { // first < second
        result.add(first);
        ++i1;
      } else {
        result.add(second);
        ++i2;
      }
    }
    // покинули цикл - или list1, или list2 уже закончился

    // list1 не закончился - значит, list2 уже закончился, иначе мы были бы в цикле while
    // и можно безопасно добавлять остаток list1 в конец result
    while (i1 < list1.size()) {
      result.add(list1.get(i1));
      ++i1;
    }

    // list2 не закончился - значит, list1 уже закончился, иначе мы были бы в цикле while
    // и можно безопасно добавлять остаток list2 в конец result
    while (i2 < list2.size()) {
      result.add(list2.get(i2));
      ++i2;
    }

    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();
    lines.add("London");
    lines.add("Paris");
    lines.add("New York");
    lines.add("Tokyo");
    lines.add("Dubai");

    System.out.println(lines);
    lines = sort(lines);
    System.out.println(lines);
  }
}
