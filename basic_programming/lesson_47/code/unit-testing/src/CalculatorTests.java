import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

  // arrange - упорядочить, установить
  private Calculator calc = new Calculator();

  // сложение положительных целых чисел
  @Test
  public void addPositiveIntegers() { // название теста
    // act - выполнить действие
    int result = calc.add(2, 5);

    // assert - сравнить результат с правильным
    // assertEquals(expected, actual)
    // предположитьРавенство(ожидание, реальность)
    assertEquals(7, result);

    // все три этапа в одной строке:
    assertEquals(4, calc.add(2, 2));
  }

  @Test
  public void addNegativeIntegers() {
    assertEquals(-5, calc.add(-2, -3));
    assertEquals(-5, calc.add(-3, -2));
  }

  @Test
  public void addNegativeZero() {
    assertEquals(-5, calc.add(-5, 0));
    assertEquals(-5, calc.add(0, -5));
  }
}
