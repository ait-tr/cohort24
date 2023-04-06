import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class Task1MaxOddTests {

  @Test
  public void foundPositive() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(7);
    numbers.add(5);
    numbers.add(22);

    int index = Task1MaxOdd.firstIndexOfMaxOdd(numbers);

    assertEquals(1, index);
  }

  @Test
  public void foundNegative() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(-3);
    numbers.add(-7);
    numbers.add(-5);
    numbers.add(-22);

    int index = Task1MaxOdd.firstIndexOfMaxOdd(numbers);

    assertEquals(0, index);
  }

  @ParameterizedTest
  @MethodSource("notFoundData")
  public void notFound(ArrayList<Integer> numbers, int expected) {
    // act
    int index = Task1MaxOdd.firstIndexOfMaxOdd(numbers);

    // assert
    assertEquals(expected, index);
  }

  static Stream<Arguments> notFoundData() {
    return Stream.of(
        Arguments.of(new ArrayList<>(Arrays.asList(2, 4, 6)), -1),
        Arguments.of(new ArrayList<>(Arrays.asList(-2, -4, -6)), -1)
    );
  }

  @ParameterizedTest
  @CsvSource({
      "1, 2, 3, 4, 2",
  })
  public void foundPositiveParametrized(int a, int b, int c, int d, int expected) {
//    ArrayList<Integer> numbers = new ArrayList<>();
//    numbers.add(a);
//    numbers.add(b);
//    numbers.add(c);
//    numbers.add(d);
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(a, b, c, d));

    int index = Task1MaxOdd.firstIndexOfMaxOdd(numbers);

    assertEquals(expected, index);
  }
}
