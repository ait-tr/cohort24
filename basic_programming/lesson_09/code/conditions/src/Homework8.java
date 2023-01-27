import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework8 {
  final public static int CHECK = 3;

  // Напишите программу, в которой пользователь вводит с клавиатуры целое число, а программа ему
  // рассказывает, отрицательное это число, положительное или нулевое, и делится ли оно на три.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());

    boolean negative = (number < 0);
    boolean positive = (number > 0);
    boolean isZero = (number == 0);
    boolean multipleOf = ((number % CHECK) == 0);

    System.out.println("Число " + number + " отрицательное: " + negative);
    System.out.println("Число " + number + " положительное: " + positive);
    System.out.println("Число " + number + " - ноль: " + isZero);
    System.out.println("Число " + number + " делится на " + CHECK + ": " + multipleOf);
  }
}
