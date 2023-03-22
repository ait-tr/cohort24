package bills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bill {

  private final String service; // услуга
  private final double cost; // сумма оплаты

  public Bill(String service, double cost) {
    this.service = service;
    this.cost = cost;
  }

  public String getService() {
    return service;
  }

  public double getCost() {
    return cost;
  }

  @Override
  public String toString() {
    return String.format("Счёт за услугу \"%s\": %.2f", service, cost);
  }

  public static Bill readBill() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите название услуги: ");
    String service = br.readLine();
    System.out.print("Введите стоимость услуги: ");
    double cost = Double.parseDouble(br.readLine());
    return new Bill(service, cost);
  }
}
