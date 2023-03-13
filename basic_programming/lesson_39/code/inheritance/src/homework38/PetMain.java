package homework38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PetMain {

  // Создать класс `Main`, в котором данные будут считываться с консоли и красиво выводиться на
  // экран.
  //
  // Формат входных данных: количество строк с записями о домашних животных, затем сами записи
  // в описанном формате.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    List<Pet> pets = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      pets.add(Pet.parsePet(br.readLine()));
    }

    for (Pet pet : pets) {
      System.out.println(pet.getPetString());
    }
  }
}