package register;

import java.util.ArrayList;
import java.util.List;

public class Register {

  private final List<Receipt> receipts = new ArrayList<>();
  private Receipt current = new Receipt(); // текущий (открытый) чек

  public void addLine() {
    current.addLine();
  }

  public void newReceipt() {
    if (!current.isEmpty()) {
      receipts.add(current); // добавляем "старый" текущий чек в список закрытых
      current = new Receipt(); // открываем ещё один (новый) чек
    }
    // если чек был пустым, ничего не произойдёт
  }

  public void printReport() {
    // TODO закрыть последний открытый чек - обычно мы добавляем чеки только после закрытия
    System.out.println("Выводим отчёт");
  }
}
