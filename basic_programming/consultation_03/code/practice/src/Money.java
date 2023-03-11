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

  // "фальшивый" геттер - возвращаем "рубли" в виде double,
  // а хранить продолжаем "копейки" в виде long
  public double getAmount() {
    return amount / 100.0;
  }

  // нет getCurrency() - отдельно валюта нам не нужна

  // "фальшивый" геттер
  // вернём красивую строку для печати
  public String getMoneyString() {
    return String.format("%.2f %s", getAmount(), currency);
  }
}
