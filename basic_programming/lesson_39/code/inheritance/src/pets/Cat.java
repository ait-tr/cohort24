package pets;

public class Cat extends pets.Pet {

  public Cat(String name, String dateOfBirth, double weight) {
    super(name, dateOfBirth, weight);
  }

  public void makePurr() {
    System.out.println("Мррр...");
  }
}
