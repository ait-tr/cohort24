package homework_48;

import java.util.Comparator;

public class RectangleAreaComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    return (int) Math.signum(o1.getArea() - o2.getArea());
  }
}
