package pets;

public class Cat extends pets.Pet {

  public Cat(String name) {
    super(name);
  }

  @Override // Перезаписать
  public void makeSomeNoise() {
    System.out.println(getName() + ": Мяу!");
  }
}
