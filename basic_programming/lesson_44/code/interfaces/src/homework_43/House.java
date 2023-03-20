package homework_43;

// Создайте абстрактный класс "Дом".
public abstract class House {

  private String address;

  // В качестве аргумента конструктора принимайте адрес.
  public House(String address) {
    this.address = address;
  }

  // Напишите для адреса сеттер и геттер.

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Дом по адресу " + address;
  }

  // Добавьте классу "Дом" виртуальный метод "снести".
  public abstract void destroy();
}
