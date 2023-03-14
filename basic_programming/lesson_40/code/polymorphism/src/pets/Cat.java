package pets;

public class Cat extends pets.Pet {

  public Cat(String name) {
    super(name);
  }

  @Override // Перезаписать
  public void makeSomeNoise() {
    System.out.println(getName() + ": Мяу!");
  }

  @Override
  public String toString() {
    return String.format("Кошка по кличке %s", getName());
  }
}
