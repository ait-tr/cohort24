import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sale {
  final public static int MONTHLY = 50;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Калькулятор стоимости подписки");
    System.out.println("Подписка на месяц стоит " + MONTHLY);
    System.out.println("Введите количество месяцев:");
    int months = Integer.parseInt(br.readLine());
    double price = MONTHLY * months;
    switch (months) {
      case 3:
      case 4:
      case 5:
        price -= price * 0.1;
        break;
      case 6:
      case 7:
      case 8:
        price -= price * 0.2;
        break;
      case 9:
      case 10:
      case 11:
        price -= price * 0.3;
        break;
      case 12:
        price -= price * 0.5;
        break;
    }

//    price = months > 6 ? price * 0.8 : price;
  }
}
