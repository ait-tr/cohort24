import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Set;

public class Homework25_1 {

  // Написать программу, которая:
  // * прочитает с клавиатуры количество чисел,
  // * прочитает с клавиатуры сами числа и соберёт их в множество,
  // * удалит из множества числа, большие 10,
  // * выведет полученные результаты на экран.
  //
  // Все числа, которые подаются на вход, целые.
  public static void main(String[] args) throws IOException {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine()); // NumberFormatException

      Set<Integer> numbers = new HashSet<>();
      for (int i = 0; i < n; ++i) {
        int x = Integer.parseInt(br.readLine()); // NumberFormatException
        numbers.add(x);
      }

      Set<Integer> toRemove = new HashSet<>(); // здесь будут числа, которые мы хотим удалить
      for (int x : numbers) {
        if (x > 10) {
          toRemove.add(x);
        }
      }
      System.out.println(toRemove);

      for (int x : toRemove) {
        numbers.remove(x);
      }
//      numbers.removeAll(toRemove);
      System.out.println(numbers);
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат числа: " + e.getMessage());
    }
  }
}
