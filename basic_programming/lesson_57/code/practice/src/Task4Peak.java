import java.util.ArrayList;

public class Task4Peak {

  // Поиск одного любого локального максимума
  // 1, 2, 3, 2, 5, 4, 3
  //
  //             *
  //             *  *
  //       *     *  *  *
  //    *  *  *  *  *  *
  // *  *  *  *  *  *  *
  // локальные максимумы: 3 и 5. Их соседи меньше них самих
  // 5 минут паузы на придумывание идеи решения

  /**
   * Поиск любого локального максимума
   *
   * @param numbers массив чисел
   * @return индекс локального псевдо-максимума (больше соседей или равен им)
   * (для чисел 3, 3, 3 среднее подойдёт)
   */
  public static int indexOfExtremum(int[] numbers) {
    // идея: тыкать пальцем в середину (a2) списка
    // если a1 <= a2 < a3 - локальный максимум где-то справа от a2
    // если a1 > a2 >= a3 - локальный максимум где-то слева от a2
    // если a1 <= a2 >= a3 - локальный максимум -- это a2
    // если a1 > a2 или a1 < a2 - чисел всего два - то локальный максимум очевиден
    // если a1 > a2 < a3 - локальный максимум будет и там, и там - шагаем вправо (а можно влево)
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if (mid == left) { // right == left + 1
        if (numbers[mid] > numbers[right]) { // a1 > a2
          return mid;
        }
        return right; // a1 < a2
      }
      int a1 = numbers[mid - 1];
      int a2 = numbers[mid];
      int a3 = numbers[mid + 1];
      if (a1 <= a2 && a2 < a3) {
        left = mid; // локальный максимум где-то справа
      } else if (a1 > a2 && a2 >= a3) {
        right = mid; // локальный максимум где-то слева
      } else if (a1 <= a2 && a2 >= a3) {
        return mid;
      } else if (a1 > a2 && a2 < a3) {
        left = mid; // шагаем вправо (а можно влево: right = mid;)
      }
    }
    // left == right
    return left;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 2, 5, 4, 3};
    int index = indexOfExtremum(numbers);
    System.out.println("numbers[" + index + "] = " + numbers[index]);
  }
}
