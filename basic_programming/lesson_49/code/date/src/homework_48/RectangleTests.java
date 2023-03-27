package homework_48;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTests {

  @Test
  public void width() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    int width = Math.min(sideA, sideB);

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(width, rect.getWidth());
  }

  @Test
  public void length() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    int length = Math.max(sideA, sideB);

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(length, rect.getLength());
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
}
