import java.io.BufferedReader;
import java.io.IOException;

public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // этот метод прочитает точку с клавиатуры
  public static Point read(BufferedReader bufferedReader) throws IOException {
    System.out.println("Введите координаты точки:");
    String coordinates = bufferedReader.readLine();
    return parse(coordinates);
  }

  // превращаем строку вида "x, y" в координаты
  public static Point parse(String coordinates) {
    int sepIndex = coordinates.indexOf(',');
    if (sepIndex == -1) {
      throw new IllegalArgumentException(
          "Неправильный формат координат, введите два целых числа через запятую: " + coordinates);
    }
    int x = Integer.parseInt(coordinates.substring(0, sepIndex)); // "x, y" -> "x" -> x
    // "   abc  ".trim() --> "abc"
    // "x, y" -> " y" -> "y" -> y
    int y = Integer.parseInt(coordinates.substring(sepIndex + 1).trim());
    return new Point(x, y);
  }
}
