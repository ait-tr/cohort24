import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

  // Напишите программу вывода на экран трех последовательно идущих чисел, каждое на отдельной
  // строке. Первое число вводит пользователь, остальные числа вычисляются в программе.
  //
  // Формат входных данных
  // На вход программе подается одно целое число.
  //
  // Формат выходных данных
  // Программа должна вывести три последовательно идущих числа в соответствии с условием задачи.

//  Пример ввода:
//      8
//  Пример вывода:
//      8
//      9
//      10
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());

//    System.out.println(number + 0);
//    System.out.println(number + 1);
//    System.out.println(number + 2);
    for (int i = 0; i < 3; ++i) {
      System.out.println(number + i);
    }
  }
}
