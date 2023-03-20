package homework_43;

// Создайте классы "Частный дом"
public class Mansion extends House {

  public Mansion(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return "Частный дом по адресу " + getAddress();
  }
}
