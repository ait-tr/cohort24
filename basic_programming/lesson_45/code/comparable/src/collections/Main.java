package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " чисел:");
    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }
    System.out.println("numbers = " + numbers);

    // Collections.max(); // находит максимум - для всех Collection
    // выбросит NoSuchElementException, если коллекция пустая
    System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
    // Collections.min(); // находит минимум - для всех Collection
    // выбросит NoSuchElementException, если коллекция пустая
    System.out.println("Collections.min(numbers) = " + Collections.min(numbers));

    Collections.reverse(numbers); // разворачивает "в обратном порядке" - для всех List
    System.out.println("После `Collections.reverse(numbers)` список numbers = " + numbers);

    Collections.sort(numbers); // сортирует - для всех List
    System.out.println("После `Collections.sort(numbers)` список numbers = " + numbers);

    Set<Integer> numbersSet = new HashSet<>();
    numbersSet.addAll(numbers); // любую коллекцию через addAll можно "расширить" любой коллекцией
    // в том числе Map.keySet() и Map.values()

    Map<String, String> phonebook = new HashMap<>();
    phonebook.put("Андрей", "+123");
    phonebook.put("eгор", "+234");
    phonebook.put("Борис", "+345");

    List<String> sortedNames = new ArrayList<>(phonebook.keySet()); // почти любую коллекцию можно
    // создать из другой почти любой коллекции
    Collections.sort(sortedNames);
    for (String name : sortedNames) {
      System.out.println(name + ": " + phonebook.get(name));
    }

    String word1 = "мама";
    String word2 = "мыла";
    System.out.println(word1.compareTo(word2));
  }
}
