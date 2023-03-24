package register;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

  private final List<ReceiptLine> lines = new ArrayList<>();

  public void addLine() {
    System.out.println("Добавляем товар в чек");
  }

  public boolean isEmpty() {
    return lines.isEmpty();
  }
}
