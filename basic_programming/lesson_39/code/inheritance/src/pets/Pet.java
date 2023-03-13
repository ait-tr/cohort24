package pets;

public class Pet {

  private String name;
  private String dateOfBirth;
  protected double weight;

  public Pet(String name, String dateOfBirth, double weight) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.weight = weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  // дату рождения могут сначала не знать, а потом узнать и добавить к существующей записи
  // поэтому сеттер есть
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public double getWeight() {
    return weight;
  }

  public void makeSomeNoise() {
    System.out.println(getName() + ": Звуки животного мира");
  }
}
