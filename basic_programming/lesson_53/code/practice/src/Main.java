import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  // Игра в крестики-нолики
  // если игра завершена, можем спросить, начать ли новую игру
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("=== Крестики-нолики ===");
    TicTacToe game = new TicTacToe();
    do {
      String result = game.run();
      // когда метод завершится, игра закончится
      System.out.println(result);
      System.out.println("Хотите повторить? [y/n]");
    } while (readYesOrNo(br.readLine())); // падение при некорректном вводе - ожидаемое поведение
    System.out.println("До свидания!");
  }

  private static boolean readYesOrNo(String answer) {
    return switch (answer.toLowerCase()) {
      case "y", "yes", "да", "true", "1" -> true;
      case "n", "no", "нет", "false", "0" -> false;
      default -> // все остальные случаи
          throw new IllegalArgumentException("Некорректный ответ, введите да или нет: " + answer);
    };
  }
}
