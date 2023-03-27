package homework_48;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RectangleTests {

  @ParameterizedTest // тест с параметрами (аргументами метода)
  // в качестве одного (обычно последнего) аргумента можно добавить expected - ожидаемое значение
  // arrange
  @CsvSource({
      "3, 5", // строка с аргументами через запятую в порядке аргументов метода
      "5, 3",
      "3, 3",
  })
  public void width(int sideA, int sideB) {
    // arrange
    int width = Math.min(sideA, sideB);

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(width, rect.getWidth());
  }

  @ParameterizedTest
  // arrange
  @CsvSource({
      "3, 5",
      "5, 3",
      "3, 3",
  })
  public void length(int sideA, int sideB) {
    // arrange
    int length = Math.max(sideA, sideB);

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(length, rect.getLength());
  }

  @ParameterizedTest
  // arrange
  @CsvSource({
      "3, 5",
      "5, 3",
      "3, 3",
  })
  public void area(int sideA, int sideB) {
    // arrange
    int area = sideA * sideB;

    // arrange & act
    Rectangle rect = new Rectangle(sideA, sideB);

    // assert
    assertEquals(area, rect.getArea());
  }

  @ParameterizedTest
  @CsvSource({
      "0, 3",
      "3, 0",
      "0, 0",
  })
  public void zeroSides(int sideA, int sideB) {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(sideA, sideB));
  }

  @ParameterizedTest
  @CsvSource({
      "-1, 3",
      "3, -1",
      "-1, -1",
      "-2, -3",
      "-3, -2",
  })
  public void negativeSides(int sideA, int sideB) {
    assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(sideA, sideB));
  }
}
