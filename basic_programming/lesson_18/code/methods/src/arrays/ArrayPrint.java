package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPrint {

  // метод - public static ТипВозвращаемогоЗначения имяМетода(аргументы)
  // аргументы - то, что попадает в этот метод при вызове (снаружи)

  // прочитать размер массива и сам массив и вернуть получившийся массив
  public static int[] readArray() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // прочитать размер массива
    System.out.print("Введите размер массива: ");
    int n = Integer.parseInt(br.readLine());

    // array - адрес многоэтажки, самой многоэтажки пока нет
    // сопоставляем адрес и новую многоэтажку
    int[] array = new int[n]; // new int[n] - новая многоэтажка

    System.out.println("Введите " + n + " элементов, каждый с новой строки:");
    // прочитать сам массив
    for (int i = 0; i < n; ++i) {
      array[i] = Integer.parseInt(br.readLine());
    }
    return array; // завершить метод и отдать (вернуть - return) результат
  }

  // напечатать массив (вывести на экран) через запятую
  public static void printArray(int[] ints) {
    for (int i = 0; i < ints.length; ++i) {
      if (i < ints.length - 1) { // не последний
        System.out.print(ints[i] + ", ");
      } else { // последний
        System.out.println(ints[i]);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    int[] numbers = readArray();
    printArray(numbers);

    int[] numbers2 = readArray();
    printArray(numbers2);
  }
}
