import java.util.ArrayList;
import java.util.List;
import pets.Cat;
import pets.Dog;
import pets.Pet;

public class PetsMain {

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
//      Pet tempPet = new Pet(name);
//      pets.add(tempPet);
//    }

    Pet cat = new Cat( "Пушок");
    pets.add(cat);

    Pet dog = new Dog( "Клык");
    pets.add(dog);

    Pet turtle = new Pet( "Тортилла");
    pets.add(turtle);

    for (Pet pet : pets) {
      pet.makeSomeNoise(); // использование полиморфизма классов Cat, Dog и Pet
    }

    System.out.println("В списке pets лежат:");
    for (Pet pet : pets) {
      System.out.println("- " + pet); // здесь автоматически вызовется toString()
    }
  }
}
