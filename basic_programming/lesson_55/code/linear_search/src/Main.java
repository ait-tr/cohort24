import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  // линейный поиск - поиск с перебором всех элементов
  // сложность перебора не может быть меньше O(N)
  // линейный поиск предполагает, что никакого "вложенного" перебора не будет
  // значит, сложность не должна быть выше O(N)
  // такая сложность тоже называется линейной - на графике такие функции выглядят как прямые линии

  // Дана последовательность целых чисел
  // Хотим найти число x
  // вывести его индекс в последовательности, если число найдено
  // вывести -1, если число не найдено
  public static void main(String[] args) throws IOException {
    List<Integer> numbers = Utils.readList();
    System.out.println(numbers);
  }
}
