package homework_43;

// Создайте классы "Частный дом"
public class Mansion extends House {

  private boolean destroyed;

  public Mansion(String address) {
    super(address);
    this.destroyed = false;
  }

  @Override
  public String toString() {
    if (destroyed) {
      return "Снесённый частный дом по адресу " + getAddress();
    }
    return "Частный дом по адресу " + getAddress();
  }

  @Override
  public void destroy() {
    if (!destroyed) {
      System.out.println("Вы снесли частный дом");
      destroyed = true;
    } else {
      System.out.println("Дом уже снесён");
    }
  }
}
