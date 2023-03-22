package bills;

public class Bill {

  private final String service; // услуга
  private final double amount; // сумма оплаты

  public Bill(String service, double amount) {
    this.service = service;
    this.amount = amount;
  }

  public String getService() {
    return service;
  }

  public double getAmount() {
    return amount;
  }
}
