import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1GuessNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Загадайте число от 1 до 1000.");
    System.out.println("На вопросы отвечайте символами '>', '<' или '=':");
    System.out.println("'>', если ваше число больше предложенного;");
    System.out.println("'<', если ваше число меньше предложенного;");
    System.out.println("'=', если мы угадали ваше число.");

    int result = guessNumber(br);
    System.out.println("Вы загадали число " + result + "!");
  }

  private static int guessNumber(BufferedReader br) throws IOException {
    int left = 1;
    int right = 1000;
    while (left < right) {
      int mid = (left + right) / 2;
      System.out.println("Ваше число - " + mid + "?");
      String answer = br.readLine();
      switch (answer) {
        // искомое число больше mid, то есть в диапазоне от (mid + 1) до right
        case ">" -> left = mid + 1;
        // искомое число меньше mid, то есть в диапазоне от left до (mid - 1)
        case "<" -> right = mid - 1;
        case "=" -> {
          System.out.println("Ура!");
          return mid;
        }
        default -> System.out.println("Вы ввели некорректный ответ, введите '>', '<' или '='");
      }
    }
    // сюда мы попадём, если left совпал с right - это и есть ответ

    return left;
  }
}
