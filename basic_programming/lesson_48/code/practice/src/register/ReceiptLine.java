package register;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
      throw new IllegalArgumentException("Стоимость должна быть положительной: " + price);
    }
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public int getPrice() {
    return price;
  }

  public static ReceiptLine readReceiptLine() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите название позиции: ");
    String title = br.readLine();
    System.out.print("Введите стоимость: ");
    int price = Integer.parseInt(br.readLine());

    return new ReceiptLine(title, price);
  }

  @Override
  public String toString() {
    return title + ": " + price;
  }
}
