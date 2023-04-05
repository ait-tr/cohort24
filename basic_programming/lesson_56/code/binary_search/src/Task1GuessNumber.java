public class Task1GuessNumber {

  public static void main(String[] args) {
    System.out.println("Загадайте число от 1 до 1000.");
    System.out.println("На вопросы отвечайте символами '>', '<' или '=':");
    System.out.println("'>', если ваше число больше предложенного;");
    System.out.println("'<', если ваше число меньше предложенного;");
    System.out.println("'=', если мы угадали ваше число.");

    int result = guessNumber();
    System.out.println("Вы загадали число " + result + "!");
  }

  private static int guessNumber() {
    return 0;
  }
}
