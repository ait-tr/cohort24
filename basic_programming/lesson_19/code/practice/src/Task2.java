import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

  //   Напишите программу, вычисляющую объём куба и площадь его полной поверхности
//   по введённому значению длины ребра.
//
//   Формат входных данных
//   На вход программе подается одно целое число – длина ребра.
//
//   Формат выходных данных
//   Программа должна вывести текст и числа в соответствии с условием задачи.
//
//   Примечание. Объём куба и площадь полной поверхности можно вычислить по формулам:
//   V = a^3, S = 6 * a^2
//
//   Пример ввода:
//   25
//   Пример вывода:
//   Объем = 15625
//   Площадь полной поверхности = 3750
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int v = (int) Math.pow(n, 3); // n^3
    int s = 6 * (int) Math.pow(n, 2);

    System.out.println("Объем = " + v);
    System.out.println("Площадь полной поверхности = " + s);
  }
}
