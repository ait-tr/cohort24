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
    System.out.println(numbers);
  }

  public static void sort(ArrayList<Integer> numbers) {
    for (int right = numbers.size(); right > 0; --right) {
      // right - правая граница области поиска (не включая)
      // перебираем все индексы от 0 (включая) до right (не включая)
      for (int i = 0; i < right - 1; ++i) { // "левыми" индексами могут быть все, кроме последнего
        int first = numbers.get(i);
        int second = numbers.get(i + 1);
        if (first > second) {
          // если "левый" элемент пары больше "правого", то меняем их местами
          numbers.set(i, second);
          numbers.set(i + 1, first);
        }
      }
    }
  }
}
