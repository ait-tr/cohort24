package homework_43;

// "Многоквартирный дом"
public class Apartment extends House {

  private final int entrances;

  // При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
  // количество подъездов.
  public Apartment(String address, int entrances) {
    super(address);
    this.entrances = entrances;
  }

  public int getEntrances() {
    return entrances;
  }

  @Override
  public String toString() {
    return "Многоквартирный дом по адресу " + getAddress() + ", " + entrances + " подъездов";
  }
}
