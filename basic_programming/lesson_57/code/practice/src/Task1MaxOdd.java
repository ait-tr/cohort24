import java.util.ArrayList;

public class Task1MaxOdd {

  // поиск индекса максимального нечётного числа в последовательности
  // если нечётных чисел в последовательности нет, вернуть -1

  /**
   * Поиск первого появления максимального нечётного числа
   * @param numbers список чисел
   * @return индекс максимального нечётного числа или -1, если нечётных чисел нет
   */
  public static int firstIndexOfMaxOdd(ArrayList<Integer> numbers) {
    int maxOdd = -1; // максимальный нечётный элемент
    int result = -1; // индекс максимального нечётного элемента

    for (int i = 0; i < numbers.size(); ++i) {
      if (numbers.get(i) % 2 != 0 && numbers.get(i) > maxOdd) {
        maxOdd = numbers.get(i);
        result = i;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(7);
    numbers.add(5);
    numbers.add(1);

    System.out.println(numbers);
    int index = firstIndexOfMaxOdd(numbers);
    System.out.println("Индекс: " + index);
    if (index != -1) {
      System.out.println("Элемент: " + numbers.get(index));
    }
  }
}
