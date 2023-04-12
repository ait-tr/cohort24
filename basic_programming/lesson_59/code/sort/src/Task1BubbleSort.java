import java.util.ArrayList;

public class Task1BubbleSort {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(1);
    numbers.add(7);
    numbers.add(2);
    numbers.add(5);

    System.out.println(numbers);
    sort(numbers);
    System.out.println("result: " + numbers);
  }

  // O(n / 2 * (n - 1)) = O(n * 0.5 * (n - 1)) = O(0.5 * n * n - 0.5 * n * 1) =
  // = O(0.5 * n^2 - 0.5 * n) = O(0.5 * n^2) = O(n^2) - time
  // O(1) - additional space
  public static void sort(ArrayList<Integer> numbers) {
    for (int right = numbers.size(); right > 1; --right) { // O(n - 1)
      // right - правая граница области поиска (не включая)
      // перебираем все индексы от 0 (включая) до right (не включая)
//      System.out.println("indices: from " + 0 + " to " + right);
      // от 1 до (n - 1) раз, в среднем (n / 2) раз
      // O(n / 2) = O(0.5 * n)
      for (int i = 0; i < right - 1; ++i) { // "левыми" индексами могут быть все, кроме последнего
//        System.out.println("firstI = " + i + ", secondI = " + (i + 1));
        int first = numbers.get(i);
        int second = numbers.get(i + 1);
        if (first > second) {
          // если "левый" элемент пары больше "правого", то меняем их местами
          numbers.set(i, second);
          numbers.set(i + 1, first);
        }
//        System.out.println(numbers);
      }
//      System.out.println();
    }
  }

  public static void sort(int[] numbers) {
    for (int right = numbers.length; right > 1; --right) {
      for (int i = 0; i < right - 1; ++i) {
        if (numbers[i] > numbers[i + 1]) {
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
        }
      }
    }
  }
}
