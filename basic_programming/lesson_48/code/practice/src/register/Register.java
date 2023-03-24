package register;

import java.util.ArrayList;
import java.util.List;

public class Register {

  private final List<Receipt> receipts = new ArrayList<>(); // уже закрытые, "готовые" чеки
  private Receipt current = new Receipt(); // текущий (открытый) чек

  public void addLine(ReceiptLine line) {
    current.addLine(line);
  }

  private void closeCurrentReceipt() {
    if (current != null && !current.isEmpty()) {
      System.out.println("=== Итог ===");
      System.out.println(current);
      receipts.add(current); // добавляем "старый" текущий чек в список закрытых
      // текущий стал закрытым, поэтому указатель на текущий чек теперь показывает в никуда
      current = null;
    }
    // если чек был пустым, ничего не произойдёт
  }

  public void newReceipt() {
    closeCurrentReceipt();
    if (current == null) {
      current = new Receipt();
    }
    // если чек был пустым, ничего не произойдёт
  }

  public void printReport() {
    closeCurrentReceipt(); // закрываем последний открытый чек
    System.out.println("Выводим отчёт"); // TODO
  }
}
