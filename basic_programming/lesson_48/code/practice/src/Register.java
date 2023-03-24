import java.util.ArrayList;
import java.util.List;

public class Register {

  private final List<Receipt> receipts = new ArrayList<>();

  public void addLine() {
    System.out.println("Добавляем товар в чек");
  }

  public void newReceipt() {
    System.out.println("Начинаем новый чек");
  }

  public void printReport() {
    System.out.println("Выводим отчёт");
  }
}
