import java.util.ArrayList;
import java.util.List;

public class Task2SecondMax {

  /**
   * Первое появление второго максимума
   *
   * @param numbers список чисел
   * @return индекс второго по величине числа или -1, если такого нет
   */
  public static int firstIndexOfSecondMax(List<Integer> numbers) {
    boolean firstFound = false;
    int firstMax = Integer.MIN_VALUE; // первый максимум
    boolean secondFound = false;
    int secondMax = Integer.MIN_VALUE; // второй максимум
    int result = -1;

    int i = 0;
    for (int x : numbers) {
      if (!firstFound) { // если даже в первом максимуме ничего не было
        firstMax = x;
        firstFound = true;
      } else if (x > firstMax) { // здесь и дальше первый максимум есть
        // было:         ..., secondMaximum, firstMaximum
        // стало:        ..., secondMaximum, firstMaximum,  x
        // должно стать:      ...,           secondMaximum, firstMaximum
        secondMax = firstMax;
        secondFound = true; // перый максимум уже был, значит, и secondMax теперь точно есть
        firstMax = x;
      } else if (!secondFound) { // здесь и дальше x < firstMaximum
        secondMax = x;
        secondFound = true;
      } else if (x > secondMax) { // второй максимум тоже был
        // было:         ..., secondMaximum,                firstMaximum
        // стало:        ..., secondMaximum, x,             firstMaximum
        // должно стать:      ...,           secondMaximum, firstMaximum
        secondMax = x;
      } // в остальных случаях x где-то слева
      ++i;
    }
    return result;
  }
}
