package pets;

public class Dog extends Pet {

  public Dog(String name, String dateOfBirth, double weight) {
    super(name, dateOfBirth, weight);
  }

  public void bringShoes() {
    weight -= 0.001;
    System.out.println(getName() + ": Собаки могут носить тапочки. А могут и не носить...");
  }
}
