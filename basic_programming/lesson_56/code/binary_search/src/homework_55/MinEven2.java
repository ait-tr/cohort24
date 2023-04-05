package homework_55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinEven2 {

  // Найти минимальное чётное число в последовательности положительных чисел или
  // вывести -1, если такого числа не существует.
  //
  // Оценить временную и пространственную сложность алгоритма.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = -1; // мы не нашли ни одного чётного числа
    int minEven = -1; // сюда можно написать всё что угодно - мы всё равно перезапишем

    System.out.print("Введите количество чисел в последовательности: ");
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; ++i) {
      int x = Integer.parseInt(br.readLine());
      // x - чётное и (чётных не было или x меньше предыдущих)
      if (x % 2 == 0 && (minEven == -1 || x < minEven)) {
        minEven = x; // новый минимум
        result = i; // ответ (индекс)
      }
    }

    System.out.println("Ответ: " + result + " (число: " + minEven + ")");
  }
}
