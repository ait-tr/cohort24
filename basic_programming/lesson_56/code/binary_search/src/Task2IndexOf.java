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
  public static int indexOf(List<Integer> numbers, int target) {
    // индексы left и right сделаем "как везде" - left включая, right - не включая
    int left = 0;
    int right = numbers.size();
    // пока размер области поиска больше одного элемента
    while (left < right - 1) { // right - left > 1
      int mid = (left + right) / 2;
      if (numbers.get(mid) == target) {
        return mid;
      }
      if (numbers.get(mid) < target) {
        left = mid + 1;
      } else { // не = и не <
        right = mid; // потому что right - не включая
      }
    }
    // после окончания цикла right - left = 0 или 1, и проверяем мы numbers[left]
    if (left < numbers.size() && numbers.get(left) == target) {
      return left;
    }
    return -1; // сужение области поиска не дало нам target - его нет в списке
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + indexOf(numbers, target));
  }
}
