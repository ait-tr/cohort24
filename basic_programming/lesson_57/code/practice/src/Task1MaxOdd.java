import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1MaxOdd {

  public static int DUMMY = 72353425;

  // поиск индекса максимального нечётного числа в последовательности
  // если нечётных чисел в последовательности нет, вернуть -1

  /**
   * Поиск первого появления максимального нечётного числа
   *
   * @param numbers список чисел
   * @return индекс максимального нечётного числа или -1, если нечётных чисел нет
   */
  public static int firstIndexOfMaxOdd(ArrayList<Integer> numbers) {
    int maxOdd = DUMMY; // максимальный нечётный элемент
    int result = -1; // индекс максимального нечётного элемента

    for (int i = 0; i < numbers.size(); ++i) {
      int x = numbers.get(i);
      // если элемент чётный И (результат не менялся ИЛИ элемент больше рамочки)
      if (x % 2 != 0 && (result == -1 || x > maxOdd)) {
        maxOdd = x;
        result = i;
      }
    }
    return result;
  }

  /**
   * Поиск первого появления максимального нечётного числа
   *
   * @param numbers список чисел
   * @return индекс максимального нечётного числа или -1, если нечётных чисел нет
   */
  public static int firstIndexOfMaxOdd(LinkedList<Integer> numbers) {
    int maxOdd = DUMMY; // максимальный нечётный элемент
    int result = -1; // индекс максимального нечётного элемента

    int i = 0; // хак для LinkedList: get(i) работает как O(n), а вот for-each переходит за O(1)
    for (int x : numbers) { // O(n)
      // если элемент чётный И (результат не менялся ИЛИ элемент больше рамочки)
      if (x % 2 != 0 && (result == -1 || x > maxOdd)) {
        maxOdd = x;
        result = i;
      }
      ++i;
    }
    return result;
  }

  public static int firstIndexOfMaxOdd(List<Integer> numbers) {
    if (numbers instanceof LinkedList<Integer>) {
      LinkedList<Integer> linkedNumbers = (LinkedList<Integer>) numbers;
      return firstIndexOfMaxOdd(linkedNumbers);
    } else if (numbers instanceof ArrayList<Integer> arrayNumbers) {
      // объединение, аналогичное строчкам 56 и 57
      return firstIndexOfMaxOdd(arrayNumbers);
    } else {
      throw new IllegalArgumentException(
          "Незнакомая разновидность списка: " + numbers.getClass().getName());
      // в остальных разновидностях List мы искать не умеем
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(-3);
    numbers.add(-7);
    numbers.add(-5);
    numbers.add(-22);

    System.out.println(numbers);
    int index = firstIndexOfMaxOdd(numbers);
    System.out.println("Индекс: " + index);
    if (index != -1) {
      System.out.println("Элемент: " + numbers.get(index));
    }
  }
}
