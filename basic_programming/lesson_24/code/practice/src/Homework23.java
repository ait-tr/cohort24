import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Homework23 {

  // Напишите программу, которая:
  // - прочитает размер списка
  // - будет добавлять элементы в список, но каждый раз в начало, а не в конец списка, как обычно
  // - выведет получившийся список
  public static void main(String[] args) throws IOException {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int size = Integer.parseInt(br.readLine());
      List<Integer> numbers = new ArrayList<>(size);
      // numbers.size() == 0, указание в скобочках размера заранее выделяет память, но не меняет размер
      for (int i = 0; i < size; ++i) {
        int element = Integer.parseInt(br.readLine());
        numbers.add(0, element);
        // Вставка элемента в середину списка по индексу
        // numbers.add(index, element); - будущий индекс элемента
      }

      System.out.println(numbers);
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат числа: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.err.println("Размер списка не может быть отрицательным: " + e.getMessage());
    }
  }

//  public static int maxList(List<Integer> list) {
//    // найти максимальный элемент массива
//  }
//
//  public static int maxList(List<Integer> list) {
//    // найти третий по убыванию элемент массива
//  }
}
