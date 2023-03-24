package register;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

  private final List<ReceiptLine> lines = new ArrayList<>();
  private int total = 0;

  public void addLine(ReceiptLine line) {
    if (line == null) {
      throw new IllegalArgumentException("Строка чека не может быть null");
    }
    lines.add(line);
    total += line.getPrice();
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
    result += "----------------\n";
    result += "Общий итог: " + total;
    return result;
  }

  public int getTotal() {
    return total;
  }
}
