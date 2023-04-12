import java.util.ArrayList;

public class Task1BubbleSort {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static void sort(ArrayList<Integer> numbers) {
    for (int right = numbers.size(); right > 0; --right) {
      // right - правая граница области поиска (не включая)
      // перебираем все индексы от 0 (включая) до right (не включая)
      for (int i = 0; i < right; ++i) {
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
