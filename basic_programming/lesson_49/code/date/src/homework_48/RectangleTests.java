package homework_48;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTests {

  @Test
  public void getWidth() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    Rectangle rect = new Rectangle(sideA, sideB);

    // act
    int width = Math.min(sideA, sideB);

    // assert
    assertEquals(width, rect.getWidth());
  }

  @Test
  public void getLength() {
    // arrange
    int sideA = 3;
    int sideB = 5;
    Rectangle rect = new Rectangle(sideA, sideB);

    // act
    int length = Math.max(sideA, sideB);

    // assert
    assertEquals(length, rect.getLength());
  }
}
