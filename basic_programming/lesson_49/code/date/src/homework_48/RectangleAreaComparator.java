package homework_48;

import java.util.Comparator;

public class RectangleAreaComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    int area1 = o1.getLength() * o1.getWidth();
    int area2 = o2.getLength() * o2.getWidth();
    return area1 - area2;
  }
}
