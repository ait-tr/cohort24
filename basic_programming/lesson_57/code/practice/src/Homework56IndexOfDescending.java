import java.util.ArrayList;

public class Homework56IndexOfDescending {

  // Напишите метод для поиска числа в заранее отсортированном по убыванию
  // списке различных целых чисел.
  //
  // Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
  //
  // Используйте в качестве образца задачу 2 из классной работы.

  /**
   * Поиск элемента в отсортированном по убыванию списке
   * @param descendingNumbers отсортированный по убыванию список различных целых чисел
   * @param target число, которое необходимо найти
   * @return индекс числа в списке или -1, если число не найдено
   */
  public static int indexOf(ArrayList<Integer> descendingNumbers, int target) {
    int left = 0; // границы области поиска (индексы)
    int right = descendingNumbers.size(); // O(1)
    // пока размер области поиска больше одного элемента
    while (left < right - 1) { // right - left > 1 // O(log N)
      int mid = (left + right) / 2;
      if (descendingNumbers.get(mid) == target) { // ArrayList.get() - O(1)
        return mid;
      }
      if (descendingNumbers.get(mid) < target) { // ArrayList.get() - O(1)
        // список отсортирован по убыванию
        // если середина меньше, чем наша цель, то наша цель где-то СЛЕВА (раньше)
        right = mid; // сдвигаем правую границу - её не включаем, поэтому просто mid
      } else { // не = и не <, значит, >
        // список отсортирован по убыванию
        // если середина больше, чем наша цель, то наша цель где-то СПРАВА (позже)
        left = mid + 1; // сдвигаем левую границу - её включаем, поэтому mid + 1
      }
    }
    // после окончания цикла right - left = 0 или 1, и проверяем мы numbers[left]
    // ArrayList.get() - O(1)
    if (left < descendingNumbers.size() && descendingNumbers.get(left) == target) {
      return left;
    }
    return -1; // сужение области поиска не дало нам target - его нет в списке
  }
}
