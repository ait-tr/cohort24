package collections;

// программа должна:

// получить от пользователя:
// количество студентов
// информацию о студентах:
// - имя
// - рейтинговый балл (целое число)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// вывести на экран:
// вариант 1: информацию о студентах в алфавитном порядке
// вариант 2: информацию о студентах в порядке убывания рейтинга
public class StudentDatabase {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество студентов: ");
    int n = Integer.parseInt(br.readLine());
  }
}
