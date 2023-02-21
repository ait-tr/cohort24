import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Homework25_2 {

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

      Set<Integer> numbersCopy = new HashSet<>(numbers); // копия множества для перебора
      // чтобы удаление не сломало перебор
      for (int x : numbersCopy) { // перебираем (и проверяем) числа в копии множества
        if (x > 10) {
          numbers.remove(x); // а удаляем из исходного
        }
      }

      System.out.println(numbers);
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат числа: " + e.getMessage());
    }
  }
}
