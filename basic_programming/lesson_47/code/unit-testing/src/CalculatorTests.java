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

  @Test
  public void addCommutative() {
    // можно сравнивать не ожидание и реальность, а две реальности
    assertEquals(calc.add(3, 57), calc.add(57, 3));
  }

  @Test
  public void addPositiveZero() {
    assertEquals(5, calc.add(5, 0));
    assertEquals(5, calc.add(0, 5));
  }

  @Test
  public void addZeros() {
    assertEquals(0, calc.add(0, 0));
  }

  @Test
  public void addNegativePositive() {
    assertEquals(0, calc.add(-5, 5));
    assertEquals(0, calc.add(5, -5));
    assertEquals(-1, calc.add(5, -6));
    assertEquals(-1, calc.add(-6, 5));
    assertEquals(1, calc.add(-5, 6));
    assertEquals(1, calc.add(6, -5));
  }

  @Test
  public void addLimits() {
    assertEquals(-1, calc.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
    assertEquals(-1, calc.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
    assertEquals(Integer.MAX_VALUE, calc.add(Integer.MAX_VALUE, 0));
    assertEquals(Integer.MIN_VALUE, calc.add(0, Integer.MIN_VALUE));
  }
}
