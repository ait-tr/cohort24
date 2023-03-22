package bills;

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
}
