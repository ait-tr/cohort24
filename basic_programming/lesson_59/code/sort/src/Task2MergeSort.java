import java.util.ArrayList;
import java.util.List;

public class Task2MergeSort {

  // сортировка слиянием относится к группе алгоритмов
  // "разделяй и властвуй" - "divide and conquer"
  // идея: разобьём список на две половинки, отсортируем каждую, затем сольём назад в один список
  // в пределе каждый список состоит из одного элемента, и он УЖЕ отсортирован

  // сортировка существующего списка (без создания отсортированной копии) - сортировка in-place
  // иногда сортировка происходит in-place только внешне - внутри создаётся отсортированная копия,
  // которой заменяется оригинал.

  // наша сортировка - не in-place, она возвращает отсортированный список
  public static List<Integer> sort(List<Integer> numbers) {
    if (numbers.size() < 2) { // пустой список или список из одного элемента уже отсортирован
      return numbers; // возвращаем его, как есть
    }

    // разбить на две половинки
    int mid = numbers.size() / 2;
    List<Integer> left = numbers.subList(0, mid);
    List<Integer> right = numbers.subList(mid, numbers.size());

    System.out.println("=== sort(" + numbers + ") ===");
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
   * @param list1 отсортированный по возрастанию список чисел
   * @param list2 отсортированный по возрастанию список чисел
   * @return отсортированный по возрастанию итоговый список чисел после слияния
   */
  private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
    System.out.println("=== merge(" + list1 + ", " + list2 + ") ===");
    List<Integer> result = new ArrayList<>();
    int i1 = 0;
    int i2 = 0;

    while (i1 < list1.size() && i2 < list2.size()) {
      // пока оба списка не закончились
      int first = list1.get(i1);
      int second = list2.get(i2);
      if (first < second) {
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
    List<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(1);
    numbers.add(7);
    numbers.add(2);
    numbers.add(5);

    System.out.println(numbers);
    numbers = sort(numbers);
    System.out.println(numbers);
  }
}
