import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework12_2 {

  final public static String RED = "красный";
  final public static String BLUE = "синий";
  final public static String YELLOW = "желтый";
  final public static String ERROR = "ошибка цвета";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean red = false;
    boolean blue = false;
    boolean yellow = false;

    String color1 = br.readLine();
    if (color1.equals(RED)) {
      red = true;
    } else if (color1.equals(BLUE)) {
      blue = true;
    } else if (color1.equals(YELLOW)) {
      yellow = true;
    } else {
      System.out.println(ERROR);
      return;
    }

    String color2 = br.readLine();
    switch (color2) {
      case RED -> red = true;
      case BLUE -> blue = true;
      case YELLOW -> yellow = true;
      default -> {
        System.out.println(ERROR);
        return;
      }
    }

    if (red && blue) {
      // красный - синий
      // синий - красный
      System.out.println("фиолетовый");
    } else if (red && yellow) {
      // красный - желтый
      // желтый - красный
      System.out.println("оранжевый");
    } else if (blue && yellow) {
      // синий - желтый
      // желтый - синий
      System.out.println("зеленый");
    } else if (red) {
      // красный - красный
      System.out.println(RED);
    } else if (blue) {
      // синий - синий
      System.out.println(BLUE);
    } else if (yellow) {
      // желтый - желтый
      System.out.println(YELLOW);
    }
  }
}
