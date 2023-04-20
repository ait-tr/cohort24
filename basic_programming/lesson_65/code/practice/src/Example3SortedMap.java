import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Example3SortedMap {

  public static void main(String[] args) {
//    List<Map<String, Integer>> expenses; // если String - это категории, то List не нужен!
    Map<String, Integer> expenses = new HashMap<>(); // Map уже умеет храть много разных ключей!
    // Если вам нужно отсортировать данные в Map, есть три способа:
    List<String> keys = new ArrayList<>(expenses.keySet());
    Collections.sort(keys);

    List<Map.Entry<String, Integer>> list = new ArrayList<>(expenses.entrySet());
    Collections.sort(list, /*компаратор*/null);
    // но вместо Map.Entry<String, Integer> уже хочется свой класс
    // List<CategoryExpenses> вместо Map<> выглядит лучше и сразу можно сортировать

    Map<String, Integer> sortedExpenses = new TreeMap<>();
    // при переборе ключей или пар они УЖЕ лежать в отсортированном порядке
  }
}
