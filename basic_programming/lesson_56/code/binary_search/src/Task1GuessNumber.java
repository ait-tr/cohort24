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

  // На каждом шаге область поиска уменьшается в два раза
  // в итоге размер должен стать 1
  // значит, 1 * 2 * 2 * 2 ... = изначальный размер области поиска,
  // где количество двоек в произведении - это количество шагов

  // Если количество шагов обозначить K, то получится
  // 1 * (2 ^ k) = N
  // 2 ^ k = N
  // Логарифм - степень, в которую нужно возвести основание, чтобы получить аргумент.
  // k - степень, в которую нужно возвести 2, чтобы получить N.
  // k = log2(N) (логарифм по основанию 2)
  // O(log N) - сложность по времени - быстрее, чем O(n)
  // O(1) - сложность по памяти
  private static int guessNumber(BufferedReader br) throws IOException {
    int step = 1;
    int left = 1;
    int right = 1000;
    while (left < right) {
      int mid = (left + right) / 2;
      System.out.println(step + ". Ваше число - " + mid + "?");
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
        default -> {
          System.out.println("Вы ввели некорректный ответ, введите '>', '<' или '='");
          --step; // поправка на "пустой" шаг
        }
      }
      ++step;
    }
    // сюда мы попадём, если left совпал с right - это и есть ответ

    return left;
  }
}
