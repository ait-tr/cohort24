package homework_48;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;
import org.junit.jupiter.api.Test;

public class RectangleAreaComparatorTests {

  private final Comparator<Rectangle> comparator = new RectangleAreaComparator();

  @Test
  public void usualComparison() {
    // arrange
    Rectangle rect1 = new Rectangle(3, 5);
    Rectangle rect2 = new Rectangle(4, 7);

    // act
    int res1 = comparator.compare(rect1, rect2);
    int res2 = comparator.compare(rect2, rect1);

    // assert
    assertTrue(res1 < 0); // rect1 < rect2
    assertTrue(res2 > 0); // rect2 > rect1
  }
}
