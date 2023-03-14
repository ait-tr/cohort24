package pets;

public class Dog extends Pet {

  public Dog(String name) {
    super(name);
  }

  @Override // Перезаписать
  public void makeSomeNoise() {
//    super.makeSomeNoise(); // так можно вызвать метод базового класса
    System.out.println(getName() + ": Гав!");
  }
}
