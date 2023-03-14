package homework39;

// Создать класс `Drink` (напиток) - наследника класса `Food`. В классе должны быть дополнительно:
// - метод "открыть", который:
//   - для газированного напитка печатает "пшш",
//   - для негазированного - "скр",
//   - а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
public class Drink extends Food {

  private boolean sparkling;
  private boolean alcohol;

  public Drink(String title, double kcal, boolean sparkling, boolean alcohol) {
    super(title, kcal); // super() - конструктор базового класса
    this.sparkling = sparkling;
    this.alcohol = alcohol;
  }
}
