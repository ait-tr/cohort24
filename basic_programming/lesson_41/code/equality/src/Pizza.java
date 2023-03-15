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

  // метод equals должен уметь сравнивать наш объект с ЛЮБЫМ
  // возвращаем true, если объекты равны, и false, если не равны
  @Override
  public boolean equals(Object obj) {
    if (this == obj) { // мы сравниваем объект сам с собой (сравниваем ссылки)
      return true;
    }
    // если obj является разновидностью класса Pizza, то
    // превращаем его в объект otherPizza класса Pizza
    if (!(obj instanceof Pizza otherPizza)) {
      return false; // если "другой" объект - не пицца, то они не равны
    }
    // пиццы равны, только если совпадают названия и вес
    return title.equals(otherPizza.title) && weight == otherPizza.weight;
  }

  // переопределение equals ДОЛЖНО приводить к переопределению hashCode()
  // это специальный метод, по которому Hash* (HashSet, HashMap) решает, нужно ли вообще
  // сравнивать наши объекты.
  // Если hashCode() разный, то Hash* считает объекты РАЗНЫМИ и даже не пытается их сравнивать
  // Если hashCode() одинаковый, то Hash* сравнивает объекты через equals()
  @Override
  public int hashCode() {
    // !!! для одинаковых (через equals()) элементов hashCode() ОБЯЗАН возвращать одинаковый hash
    // это значит, что мы должны учитывать все поля, которые сравниваются в equals() (и только их)
    return 31 * weight * title.hashCode();
  }
}
