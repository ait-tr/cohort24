public class Money {

  private long amount; // в "копейках" - минимальных целых единицах
  final private String currency; // валюта

  public Money(double amount, String currency) {
    setAmount(amount);
    this.currency = currency;
  }

  public void setAmount(double amount) {
    this.amount = Math.round(amount * 100); // переводим "рубли" в "копейки"
  }

  // нет setCurrency() - нельзя поменять валюту, она final

  // нет getAmount() - отдельно количество денег нам не нужно

  // нет getCurrency() - отдельно валюта нам не нужна

  // "фальшивый" геттер
  public String getMoneyString() {
    return String.format("%.2f %s", amount / 100.0, currency);
  }
}
