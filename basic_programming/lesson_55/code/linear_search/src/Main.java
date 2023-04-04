import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  // линейный поиск - поиск с перебором всех элементов
  // сложность перебора не может быть меньше O(N)
  // линейный поиск предполагает, что никакого "вложенного" перебора не будет
  // значит, сложность не должна быть выше O(N)
  // такая сложность тоже называется линейной - на графике такие функции выглядят как прямые линии

  // Дана последовательность целых чисел.
  // Хотим найти число x
  // вывести его индекс в последовательности, если число найдено
  // если число встретилось несколько раз, ищем самое первое (левое) вхождение
  // вывести -1, если число не найдено
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> numbers = Utils.readList();

    System.out.print("Введите число для поиска: ");
    int x = Integer.parseInt(br.readLine());
    int i = find(numbers, x);
    if (i != -1) {
      System.out.println("numbers[" + i + "] = " + numbers.get(i));
    } else {
      System.out.println("Число не найдено");
    }
  }

  /*
   * Поиск числа target в списке numbers
   *
   * Вернёт первый возможный индекс или -1, если числа нет
   */
  public static int find(List<Integer> numbers, int target) {
    for (int i = 0; i < numbers.size(); ++i) {
      if (numbers.get(i) == target) {
        // i - наш ответ
        return i;
      }
    }
    // если мы дошли до этого места, то мы не нашли число target
    return -1;
  }
}
