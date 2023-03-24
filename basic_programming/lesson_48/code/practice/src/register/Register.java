package register;

import java.util.ArrayList;
import java.util.List;

public class Register {

  private final List<Receipt> receipts = new ArrayList<>();
  private Receipt current = new Receipt(); // текущий (открытый) чек

  public void addLine() {
    System.out.println("Добавляем товар в чек");
  }

  public void newReceipt() {
    // TODO проверка, что "старый" чек не пустой
    receipts.add(current); // добавляем "старый" текущий чек в список закрытых
    current = new Receipt(); // открываем ещё один (новый) чек
    System.out.println("Начинаем новый чек");
  }

  public void printReport() {
    // TODO закрыть последний открытый чек - обычно мы добавляем чеки только после закрытия
    System.out.println("Выводим отчёт");
  }
}
