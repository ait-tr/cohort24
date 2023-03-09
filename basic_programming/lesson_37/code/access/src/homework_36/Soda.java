package homework_36;

// Создайте класс `Soda` (для определения типа газированной воды).
public class Soda {

  private String supplement;

  // У класса должен быть конструктор, принимающий 1 аргумент при инициализации -
  // строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
  public Soda(String supplement) {
    this.supplement = supplement;
  }

  // В этом классе реализуйте метод `public String getMyDrinkString()`, возвращающий строку
  // "Газировка и {добавка}" в случае наличия добавки.
  // Если добавки нет, нужно вернуть строку "Обычная газировка".
  public String getMyDrinkString() {
    // if (!(supplement == null || supplement.isEmpty())) {
    if (supplement != null && !supplement.isEmpty()) {
      return "Газировка и " + supplement;
//      return String.format("Газировка и %s", supplement);
    } else {
      return "Обычная газировка";
    }
  }
}
