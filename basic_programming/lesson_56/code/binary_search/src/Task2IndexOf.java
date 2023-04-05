import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2IndexOf {

  /**
   * Поиск числа target в списке numbers
   * @param numbers отсортированный по возрастанию список различных целых чисел
   * @param target число, которое необходимо найти
   * @return индекс числа target в списке numbers или -1, если число не найдено
   */
  public static int indexOf(ArrayList<Integer> numbers, int target) { // O(1) по памяти
    // считаем сложность по времени
    // индексы left и right сделаем "как везде" - left включая, right - не включая
    int left = 0;
    int right = numbers.size(); // опасность! но для библиотечных коллекций это O(1)
    // пока размер области поиска больше одного элемента
    while (left < right - 1) { // right - left > 1 // O(log N)
      int mid = (left + right) / 2;
      // ArrayList.get() - сложность O(1)
      // LinkedList.get() - сложность O(n)
      if (numbers.get(mid) == target) {
        return mid;
      }
      // ArrayList.get() - сложность O(1)
      // LinkedList.get() - сложность O(n)
      if (numbers.get(mid) < target) {
        left = mid + 1;
      } else { // не = и не <
        right = mid; // потому что right - не включая
      }
    }
    // после окончания цикла right - left = 0 или 1, и проверяем мы numbers[left]
    if (left < numbers.size() && numbers.get(left) == target) {
      // ArrayList.get() - сложность O(1)
      // LinkedList.get() - сложность O(n)
      return left;
    }
    return -1; // сужение области поиска не дало нам target - его нет в списке
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) { // O(n) - time, O(n) - space
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + indexOf(numbers, target));
  }
}
