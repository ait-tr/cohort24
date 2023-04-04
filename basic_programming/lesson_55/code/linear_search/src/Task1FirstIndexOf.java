import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Task1FirstIndexOf {

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
  public static void main(String[] args) throws IOException { // O(n) - time, O(n) - space
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> numbers = Utils.readList(); // O(n) - time, O(n) - space

    System.out.print("Введите число для поиска: ");
    int x = Integer.parseInt(br.readLine());
    int i = find(numbers, x); // O(n) - time, O(1) - space
    if (i != -1) {
      System.out.println("numbers[" + i + "] = " + numbers.get(i)); // O(1)
    } else {
      System.out.println("Число не найдено");
    }
  }

  /**
   * Поиск первого (левого) вхождения числа в список
   *
   * @param numbers список чисел
   * @param target  число, которое надо найти
   * @return индекс или -1, если число не найдено
   */
  public static int find(List<Integer> numbers, int target) { // O(n)
    for (int i = 0; i < numbers.size(); ++i) { // O(n)
      if (numbers.get(i) == target) { // O(1)
        // i - наш ответ
        return i; // O(1)
      }
    }
    // если мы дошли до этого места, то мы не нашли число target
    return -1;
  }
}
