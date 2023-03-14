import java.util.ArrayList;
import java.util.List;
import pets.Cat;
import pets.Dog;
import pets.Pet;

public class Main {

  // Полиморфизм (polymorphism): Один интерфейс — много реализаций
  // Например: замена ArrayList на LinkedList
  // у них совпадают интерфейсы:
  // - метод add()
  // - метод get()
  // - метод size()
  // - возможность перебирать через for-each

  // другой пример - замена InputStreamReader на FileReader
  public static void main(String[] args) {
//    List<String> names = new ArrayList<>();
//    names.add("Пушок");
//    names.add("Клык");
//    names.add("Тортилла");

    List<Pet> pets = new ArrayList<>();
//    for (String name : names) {
//      Pet tempPet = new Pet(name, "", 0);
//      pets.add(tempPet);
//    }

    Cat cat = new Cat( "Пушок", "", 0);
    pets.add(cat);

    Dog dog = new Dog( "Клык", "", 0);
    pets.add(dog);

    Pet turtle = new Pet( "Тортилла", "", 0);
    pets.add(turtle);

    for (Pet pet : pets) {
      pet.makeSomeNoise();
    }
  }
}
