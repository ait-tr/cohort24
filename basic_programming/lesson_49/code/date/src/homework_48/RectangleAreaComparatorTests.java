package homework_48;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
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

  @Test
  public void lessFirstMoreSecondArea() {
    // arrange
    Rectangle rect1 = new Rectangle(2, 3);
    Rectangle rect2 = new Rectangle(1, 7);

    // act
    int res1 = comparator.compare(rect1, rect2);
    int res2 = comparator.compare(rect2, rect1);

    // assert
    assertTrue(res1 < 0); // rect1 < rect2
    assertTrue(res2 > 0); // rect2 > rect1
  }

  @Test
  public void lessSecondMoreFirstArea() {
    // arrange
    Rectangle rect1 = new Rectangle(3, 2);
    Rectangle rect2 = new Rectangle(7, 1);

    // act
    int res1 = comparator.compare(rect1, rect2);
    int res2 = comparator.compare(rect2, rect1);

    // assert
    assertTrue(res1 < 0); // rect1 < rect2
    assertTrue(res2 > 0); // rect2 > rect1
  }

  @Test
  public void differentSidesSameArea() {
    // arrange
    Rectangle rect1 = new Rectangle(2, 3);
    Rectangle rect2 = new Rectangle(3, 2);

    // act
    int res1 = comparator.compare(rect1, rect2);
    int res2 = comparator.compare(rect2, rect1);

    // assert
    assertEquals(0, res1); // rect1 == rect2
    assertEquals(0, res2); // rect2 == rect1
  }

  @Test
  public void sameRectangles() {
    // arrange
    Rectangle rect1 = new Rectangle(2, 3);
    Rectangle rect2 = new Rectangle(2, 3);

    // act
    int res1 = comparator.compare(rect1, rect2);
    int res2 = comparator.compare(rect2, rect1);

    // assert
    assertEquals(0, res1); // rect1 == rect2
    assertEquals(0, res2); // rect2 == rect1
  }

  @Test
  public void nullRectangles() {
    // arrange
    Rectangle rect = new Rectangle(2, 3);

    // act & assert
    assertThrowsExactly(NullPointerException.class, () -> comparator.compare(null, rect));
    assertThrowsExactly(NullPointerException.class, () -> comparator.compare(rect, null));
    assertThrowsExactly(NullPointerException.class, () -> comparator.compare(null, null));
  }
}
