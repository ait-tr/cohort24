import pets.Cat;
import pets.Dog;

public class Main {

  // Inheritance
  // Наследование — это инструмент, позволяющий описать новый класс на основе уже существующего
  // с частично или полностью заимствованной функциональностью.
  public static void main(String[] args) {
    Cat cat = new Cat( "Мурзик", "", 0);
    cat.makeSomeNoise();
    cat.setName("Мурзилла");
    cat.makePurr();

    Dog dog = new Dog( "Мурзик", "", 0);
    dog.makeSomeNoise();
    dog.bringShoes();
  }
}
