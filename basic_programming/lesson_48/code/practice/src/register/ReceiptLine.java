package register;

public class ReceiptLine {

  private final String title;
  private final int price;

  public ReceiptLine(String title, int price) {
    if (title == null) {
      throw new IllegalArgumentException("Название позиции в чеке не может быть null");
    }
    if (title.isEmpty()) {
      throw new IllegalArgumentException("Название позиции в чеке не может быть пустым");
    }
    this.title = title;
    if (price <= 0) {
      throw new IllegalArgumentException("Цена должна быть положительной: " + price);
    }
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public int getPrice() {
    return price;
  }
}
