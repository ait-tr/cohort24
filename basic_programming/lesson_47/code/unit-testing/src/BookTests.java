import homework_46.Book;
import homework_46.BookTitleAuthorComparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookTests {

  @Test
  public void BookWithNegativePages() {
    boolean exceptionThrown = false;
    try {
      Book b = new Book("", "", -5);
    } catch (IllegalArgumentException e) {
      exceptionThrown = true;
    }
    assertTrue(exceptionThrown);
//    assertThrowsExactly(IllegalArgumentException.class, () -> new Book("", "", -5));
  }
}
