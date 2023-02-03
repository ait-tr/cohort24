import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework13 {
  // Напишите программу, которая принимает три положительных числа и определяет, существует ли
  // невырожденный треугольник с такими сторонами.
  //
  // Формат входных данных
  // На вход программе подаётся три положительных целых числа.
  //
  // Формат выходных данных
  // Программа должна вывести «YES» или «NO» в соответствии с условием задачи.
  //
  // Примечание.
  // Треугольник существует, если выполняется [неравенство треугольника]
  // (https://ru.wikipedia.org/wiki/Неравенство_треугольника).

  // Неравенство AC <= AB + BC выполняется в любом треугольнике ABC.
  // Причём равенство AC = AB + BC достигается только тогда, когда треугольник вырожден.
  // Длина любой стороны треугольника не превосходит сумму длин двух других.

  // AC > AB + BC - не треугольник
  // AC <= AB + BC - треугольник
  //   AC < AB + BC - невырожденный треугольник
  //   AC == AB + BC - вырожденный треугольник

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sideA = Integer.parseInt(br.readLine());
    int sideB = Integer.parseInt(br.readLine());
    int sideC = Integer.parseInt(br.readLine());

    if ((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
