package register;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

  private final List<ReceiptLine> lines = new ArrayList<>();

  public void addLine(ReceiptLine line) {
    if (line == null) {
      throw new IllegalArgumentException("Строка чека не может быть null");
    }
    lines.add(line);
  }

  public boolean isEmpty() {
    return lines.isEmpty();
  }

  @Override
  public String toString() {
    String result = "";
    for (ReceiptLine line : lines) {
      result += line + "\n";
    }
    return result;
  }
}
