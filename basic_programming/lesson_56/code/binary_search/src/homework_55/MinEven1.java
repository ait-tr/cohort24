package homework_55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinEven1 {

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
      if (x % 2 == 0) { // если число чётное
        if (minEven == -1) { // если результат = -1, то есть чётных чисел ещё не было
          minEven = x; // первое чётное - сразу записываем в рамочку
          result = i; // ответ (индекс)
        } else if (x < minEven) { // иначе чётные уже были, сравниваем с рамочкой:
          minEven = x; // новый минимум
          result = i; // ответ (индекс)
        }
      }
    }

    System.out.println("Ответ: " + result + " (число: " + minEven + ")");
  }
}
