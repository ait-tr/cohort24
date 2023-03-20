package communications;

public class Pager implements Messenger {

  String address; // адрес этого пейджера; если с него отправлять сообщения, то адрес отправителя

  public Pager() {
    address = "Без адреса";
  }

  public Pager(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public void sendMessage(String message, String address) {
    // аргумент метода address "закрыл" (hides) собой атрибут this.address
    System.out.println(
        "Пейджер: вы отправили сообщение '" + message + "' c адреса " + this.address + " по адресу "
            + address);
  }
}
