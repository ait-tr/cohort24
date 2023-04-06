import java.util.List;

public class Task2SecondMax2 {

  /**
   * Первое появление второго максимума
   *
   * @param numbers список чисел
   * @return индекс второго по величине числа или -1, если такого нет
   */
  public static int firstIndexOfSecondMax(List<Integer> numbers) {
    int firstMax = Integer.MIN_VALUE; // первый максимум
    int secondMax = Integer.MIN_VALUE; // второй максимум
    int secondMaxIndex = -1;

    int i = 0;
    for (int x : numbers) {
      // TODO
      ++i;
    }
    return secondMaxIndex;
  }
}
