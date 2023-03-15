package homework_40;

public class Man extends Person {

  public Man(String name) {
    super(name); // при создании мужчины создаётся человек
  }

  @Override
  public String toString() {
    return "Мужчина по имени " + getName();
  }
}
