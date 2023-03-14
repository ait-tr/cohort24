package pets;

public class Pet {

  private String name;

  public Pet(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void makeSomeNoise() {
    System.out.println(getName() + ": Звуки животного мира");
  }

  // ВСЕ классы Java наследуются от класса Object
  // и наследуют от него "базовый" набор методов.
  // Один из таких методов - toString(), который используется
  // при превращении объекта в строку, в том числе внутри print()
  @Override
  public String toString() {
    return String.format("Домашнее животное по кличке %s", name);
  }
}
