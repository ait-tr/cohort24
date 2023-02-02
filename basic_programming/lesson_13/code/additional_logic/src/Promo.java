import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Калькулятор стоимости заказа");
    double price = 10000;
    System.out.println("Стоимость вашего заказа: " + price);
    System.out.println("Введите промокод или нажмите Enter:");
    String promo = br.readLine();

    // x = x + 3;
    // то же самое
    // x += 3;
    switch (promo.toUpperCase()) {
      case "AIT":
        price -= price * 0.1; // price = price - price * 0.1;
        // отними от price то, что после знака -=
        break;
      case "KIRILL":
        price -= price * 0.2;
        break;
      case "JAVA":
        price -= price * 0.05;
        break;
      case "":
        break;
      default:
        System.out.println("Нет такого промокода");
        break;
    }

    System.out.println("Стоимость вашего заказа c учётом промокода: " + price);
  }
}
