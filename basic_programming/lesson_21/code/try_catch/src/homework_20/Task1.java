package homework_20;

// Примечание
// Обязательно использовать отладочный вывод. Желательно использовать методы.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

  public static void main(String[] args) throws IOException {
    String[] lines = readArray();
    printReversedArray(lines);
  }

  public static String[] readArray() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Прочитать размер массива строк.
    int size = Integer.parseInt(br.readLine());
//    System.out.println("Создаём массив строк размера " + size);
    String[] array = new String[size];
    // Прочитать элементы массива.
    for (int i = 0; i < size; ++i) {
//      System.out.println("Читаем элемент (строку) с индексом " + i);
      array[i] = br.readLine();
    }
    return array;
  }

  public static void printReversedArray(String[] array) {
    // Вывести элементы массива в обратном порядке (от последнего к первому).
    for (int i = array.length - 1; i >= 0; --i) {
//      System.out.println("Выводим элемент с индексом " + i);
      System.out.println(array[i]);
    }
  }
}
