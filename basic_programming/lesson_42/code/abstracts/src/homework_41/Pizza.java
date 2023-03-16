package homework_41;

import java.util.Objects;

public class Pizza {

  private String title;
  private int weight;

  public Pizza(String title, int weight) {
    this.title = title;
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
