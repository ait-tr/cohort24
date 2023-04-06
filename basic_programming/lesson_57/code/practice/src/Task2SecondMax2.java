import java.util.List;

public class Task2SecondMax2 {

  /**
   * Первое появление второго максимума
   *
   * @param numbers список чисел
   * @return индекс второго по величине числа или -1, если такого нет
   */
  public static int firstIndexOfSecondMax(List<Integer> numbers) { // O(n) время, O(1) доп. память
    int firstMax = Integer.MIN_VALUE; // первый максимум
    int secondMax = Integer.MIN_VALUE; // второй максимум
    int secondMaxIndex = -1;

    for (int x : numbers) {
      if (x > firstMax) {
        firstMax = x;
      }
    }

    int i = 0;
    for (int x : numbers) { // из-за второго перебора эту задачу не свести к O(1) по общей памяти
      if (x < firstMax && (secondMaxIndex == -1 || x > secondMax)) {
        // [1, Integer.MIN_VALUE] - не то же самое, что [1, 1]
        secondMax = x;
        secondMaxIndex = i;
      }
      ++i;
    }
    return secondMaxIndex;
  }
}
