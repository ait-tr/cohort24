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
  public static Point read() {
    // TODO
    return new Point(1, 1);
  }
}
