import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3BinarySearch {

  public static void main(String[] args) throws IOException {
    System.out.println("Загадайте число от 1 до 1000");
    System.out.println("На все вопросы отвечайте символами '>', '<' или '='");
    int number = guess(1, 1000);
    System.out.println("Вы загадали число " + number + "!");
  }

  public static int guess(int left, int right) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int mid = (left + right) / 2;
    System.out.println("Ваше число - " + mid + "?");
    String answer = bufferedReader.readLine();
    switch (answer) {
      case ">" -> {
        return guess(mid + 1, right);
      }
      case "<" -> {
        return guess(left, mid - 1);
      }
      case "=" -> {
        return mid; // досрочный выход из рекурсии
      }
      default -> {
        System.out.println("На все вопросы отвечайте символами '>', '<' или '='");
        return guess(left, right); // повторяем вызов - ответ непонятен
      }
    }
  }
}
