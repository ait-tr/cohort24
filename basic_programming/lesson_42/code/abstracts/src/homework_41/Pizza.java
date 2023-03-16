package homework_41;

import java.util.Objects;

public class Pizza {

  private String title;
  private int weight;

  public Pizza(String title, int weight) {
    this.title = title;
    // Дополните файл Pizza.java из классной работы, выбросив в конструкторе исключение
    // `IncorrectWeightException` при попытке создать пиццу с отрицательной массой.
    setWeight(weight); // вместо `this.weight = weight` используем сеттер
  }

  public void setWeight(int weight) {
    if (weight < 0) {
      throw new IncorrectWeightException(weight); // сигнал об ошибке
      // throw - издать сигнал об аварии
      // после throw мы создаём конкретный сигнал - new IncorrectWeightException(weight)
      // Выбрасывание исключения работает как аварийный сигнал - всё очень плохо, дальше
      // продолжать бессмысленно.
      // Конкретно в этом случае пиица даже не будет создана.
      // Если исключение не поймать, то завершится вообще вся программа.
    }
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Пицца '" + title + "' весом " + weight + " г";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pizza pizza)) {
      return false;
    }
    return weight == pizza.weight && Objects.equals(title, pizza.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, weight);
  }
}
