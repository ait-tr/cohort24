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

  @Override
  public void destroy() {
    System.out.println("Вы снесли частный дом");
  }
}
