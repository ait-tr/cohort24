package homework_43;

// Создайте абстрактный класс "Дом".
public abstract class House {

  String address;

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
}
