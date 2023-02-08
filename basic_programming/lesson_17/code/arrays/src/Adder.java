import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adder { // Сумматор

  // Пользователь вводит количество чисел, а затем и сами числа.
  // Программа должна вывести сумму этих чисел.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    int[] numbers = new int[n];
    System.out.println("Введите " + n + " чисел, каждое на новой строке:");
    for (int i = 0; i < n; ++i) { // перебираем индексы массива - от 0 включая до размера не включая
      // массив[индекс] - элемент массива
      numbers[i] = Integer.parseInt(br.readLine());
    }
    // numbers[0] = Integer.parseInt(br.readLine());
    // numbers[1] = Integer.parseInt(br.readLine());
    // numbers[2] = Integer.parseInt(br.readLine());

    int total = 0; // "копилка" (сумматор)
    for (int i = 0; i < n; ++i) {
      total += numbers[i]; // добавить число в "копилку" (сумматор)
    }
    // total += numbers[0];
    // total += numbers[1];
    // total += numbers[2];

    System.out.println("Общая сумма введённых чисел: " + total);
  }
}
