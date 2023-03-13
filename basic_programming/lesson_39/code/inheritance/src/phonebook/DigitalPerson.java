package phonebook;

public class DigitalPerson extends Person {

  String eMail;

  public DigitalPerson(String name, String phone, String eMail) {
    super(name, phone); // первая команда в конструкторе потомка - вызов конструктора предка.
    // Если его не вызвать, Java попытается вызвать конструктор по умолчанию (default constructor)
    // - конструктор без аргументов. Если его нет, программа даже не запустится.
    this.eMail = eMail;
  }

  public DigitalPerson(String name, String eMail) {
    super(name, null); // первая команда в конструкторе потомка - вызов конструктора предка.
    this.eMail = eMail;
  }

  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  public void sendMessage() {
    System.out.printf("Отправляем сообщение %s на %s%n", getName(), eMail);
  }
}
