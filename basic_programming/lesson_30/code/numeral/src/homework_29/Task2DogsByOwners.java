package homework_29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2DogsByOwners {

  // Вам доступен список `pets`, содержащий информацию о собаках и их владельцах.
  // Каждый элемент списка – это словарь вида
  // {
  //   "dog": "кличка собаки",
  //   "owner": "имя владельца"
  // }
  //
  // Напишите метод
  // public static Map<String, List<String>> getPetsByOwner(List<Map<String, String>> pets)
  // возвращающий словарь, в котором для каждого владельца будут перечислены его собаки.
  //
  //Ключом словаря должно быть имя владельца, а значением - список кличек собак:
  // {
  //   "имя первого владельца": ["кличка первой собаки", "кличка второй собаки"],
  //   "имя второго владельца": ["кличка третьей собаки"]
  // }
  public static Map<String, List<String>> getPetsByOwner(List<Map<String, String>> pets) {
    Map<String, List<String>> result = new HashMap<>(); // будущий результат метода

    // перебираем маленькие словари - записи в исходном списке
    for (Map<String, String> entry : pets) {
      String dog = entry.get("dog"); // там точно есть ключ `dog`
      String owner = entry.get("owner"); // там точно есть ключ `owner`

      if (!result.containsKey(owner)) { // если такого владельца до этого не было
        result.put(owner, new ArrayList<>()); // кладём "базовый" пустой список
      }
//      List<String> dogs = result.get(owner); // получаем список собак для владельца
//      // (для "нового" - пустой)
//      dogs.add(dog); // добавляем в список новую собаку
      result.get(owner).add(dog);
    }

    return result;
  }

  public static void main(String[] args) {
    List<Map<String, String>> pets = new ArrayList<>();

    Map<String, String> entry = new HashMap<>();
    entry.put("dog", "Hatiko");
    entry.put("owner", "Parker Wilson");
    pets.add(entry);

    entry = new HashMap<>();
    entry.put("dog", "Rusty");
    entry.put("owner", "Josh King");
    pets.add(entry);

    entry = new HashMap<>();
    entry.put("dog", "Balto");
    entry.put("owner", "Josh King");
    pets.add(entry);

    Map<String, List<String>> result = getPetsByOwner(pets);
    System.out.println(result);
  }
}
