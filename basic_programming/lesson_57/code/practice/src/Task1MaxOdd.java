import java.util.ArrayList;

public class Task1MaxOdd {

  public static int DUMMY = 72353425;

  // поиск индекса максимального нечётного числа в последовательности
  // если нечётных чисел в последовательности нет, вернуть -1

  /**
   * Поиск первого появления максимального нечётного числа
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
