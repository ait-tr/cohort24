package homework39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Создать класс `Drink` (напиток) - наследника класса `Food`. В классе должны быть дополнительно:
// - метод "открыть", который:
//   - для газированного напитка печатает "пшш",
//   - для негазированного - "скр",
//   - а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
public class Drink extends Food {

  final private static int AGE_LIMIT = 18;
  private boolean sparkling;
  private boolean alcohol;

  public Drink(String title, double kcal, boolean sparkling, boolean alcohol) {
    super(title, kcal); // super() - конструктор базового класса
    this.sparkling = sparkling;
    this.alcohol = alcohol;
  }

  public void open() throws IOException {
    if (alcohol) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Введите возраст: ");
      int age = Integer.parseInt(br.readLine());
      if (age < AGE_LIMIT) { // условие-стражник
        System.out.println("К сожалению, вам нельзя алкоголь");
        return;
      }
    }

    System.out.println(sparkling ? "пшш" : "скр");
  }
}
