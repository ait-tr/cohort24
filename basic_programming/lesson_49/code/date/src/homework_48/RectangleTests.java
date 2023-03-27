package homework_48;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class RectangleTests {

  @Test
  public void width() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    int width = Math.min(sideA, sideB);

    // arrange & act
    Rectangle rect1 = new Rectangle(sideA, sideB);
    Rectangle rect2 = new Rectangle(sideB, sideA);
    Rectangle rect3 = new Rectangle(sideA, sideA);

    // assert
    assertEquals(width, rect1.getWidth());
    assertEquals(width, rect2.getWidth());
    assertEquals(sideA, rect3.getWidth());
  }

  @Test
  public void length() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    int length = Math.max(sideA, sideB);

    // arrange & act
    Rectangle rect1 = new Rectangle(sideA, sideB);
    Rectangle rect2 = new Rectangle(sideB, sideA);
    Rectangle rect3 = new Rectangle(sideA, sideA);

    // assert
    assertEquals(length, rect1.getLength());
    assertEquals(length, rect2.getLength());
    assertEquals(sideA, rect3.getLength());
  }

  @Test
  public void area() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    int area = sideA * sideB;

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(area, rect.getArea());
  }

  @Test
  public void zeroSides() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0, 3));
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(3, 0));
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0, 0));
  }

  @Test
  public void negativeSides() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(-1, 3));
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(3, -1));
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(-2, -3));
  }
}
