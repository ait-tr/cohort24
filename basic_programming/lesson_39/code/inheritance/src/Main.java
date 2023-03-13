import java.util.ArrayList;
import java.util.List;
import pets.Cat;
import pets.Dog;
import pets.Pet;

public class Main {

  // Inheritance
  // Наследование — это инструмент, позволяющий описать новый класс на основе уже существующего
  // с частично или полностью заимствованной функциональностью.
  public static void main(String[] args) {
    List<Pet> pets = new ArrayList<>();
    // слева от = -- обещание для Java, какие методы точно будут доступны
    // справа от = -- создание конкретного объекта
    // слева часто может быть предок, а справа - потомок
    Cat cat = new Cat( "Пушок", "", 0);
    pets.add(cat);
    cat.makeSomeNoise();
    cat.makePurr(); // только с переменной класса Cat
    System.out.println();

    Dog dog = new Dog( "Клык", "", 0);
    pets.add(dog);
    dog.makeSomeNoise();
    dog.bringShoes(); // только с переменной класса Dog
    System.out.println();

    Pet turtle = new Pet( "Тортилла", "", 0);
    pets.add(turtle);
    turtle.makeSomeNoise();
    System.out.println();

    // перебираем список как "каких-то" домашних животных
    for (Pet pet : pets) {
      pet.makeSomeNoise();
//      pet.makePurr(); // только с переменной класса Cat, а у нас List<Pet>
//      pet.bringShoes(); // только с переменной класса Dog, а у нас List<Pet>
    }
  }
}
