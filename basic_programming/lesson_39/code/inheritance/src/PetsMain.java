import java.util.ArrayList;
import java.util.List;
import pets.Cat;
import pets.Dog;
import pets.Pet;

public class PetsMain {

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

    List<Cat> cats = new ArrayList<>();
    List<Dog> dogs = new ArrayList<>();
    // перебираем список как "каких-то" домашних животных
    for (Pet pet : pets) {
      pet.makeSomeNoise();
      if (pet instanceof Cat) { // если pet - разновидность класса Cat (Cat или его потомок)
        System.out.println(pet.getName() + " - кошка!");
        Cat tempCat = (Cat) pet;
        tempCat.makePurr(); // только с переменной класса Cat, а у нас List<Pet>
        cats.add(tempCat);
      } else if (pet instanceof Dog tempDog) {
        System.out.println(pet.getName() + " - собака!");
        tempDog.bringShoes(); // только с переменной класса Dog, а у нас List<Pet>
        dogs.add(tempDog);
      } else {
        System.out.println(pet.getName() + " - неведома зверушка!");
      }
      System.out.println();
    }
  }
}
