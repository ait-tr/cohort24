package homework_40;

public class Woman extends Person {

  public Woman(String name) {
    super(name); // при создании женщины создаётся человек
  }

  @Override
  public String toString() {
    return "Женщина по имени " + getName();
  }
}
