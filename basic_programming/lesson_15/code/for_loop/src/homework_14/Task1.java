package homework_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

  // Программа получает на вход строку и число повторений этой строки
  // и должна вывести эту же строку нужно количество раз.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Формат входных данных
    // На вход программе подается две строки:
    String line = br.readLine(); // строка, которую нужно повторять;
    int total = Integer.parseInt(br.readLine()); // натуральное число - количество повторений.

    // Формат выходных данных
    // Программа должна вывести нужное количество одинаковых строк.
    int counter = 0;
    while (counter < total) {
      System.out.println(line);
      ++counter; // counter = counter + 1;
    }
  }
}
