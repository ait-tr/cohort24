package register;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class ReceiptLineTests {

  @Test
  public void nullTitle() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new ReceiptLine(null, 1));
  }

  @Test
  public void emptyTitle() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new ReceiptLine("", 1));
  }

  @Test
  public void negativePrice() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new ReceiptLine("Line", -1));
  }

  @Test
  public void zeroPrice() {
    assertThrowsExactly(IllegalArgumentException.class, () -> new ReceiptLine("Line", 0));
  }

  @Test
  public void construct() {
    ReceiptLine line = new ReceiptLine("Line", 1);
    assertEquals("Line", line.getTitle());
    assertEquals(1, line.getPrice());
  }
}
