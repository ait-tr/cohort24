package communications;

public class CommunicationsRunner {

  public static void main(String[] args) {
    // new Phone() написать нельзя; Phone - это интерфейс
    // new Messenger() написать нельзя; Messenger - это интерфейс
    Pager testPager = new Pager("Тестовый исходный адрес");
    testPager.sendMessage("Тестовое сообщение", "кому-то");

    // При объявлении типа переменных можно использовать интерфейсы, как и абстрактные классы.
    // Как всегда, Java будет про эту переменную знать только то, что описано в её типе:
    // в случае с интерфейсом - только про методы из этого интерфейса
    RotaryPhone testPhone = new RotaryPhone();
    testPhone.call("112");
    // если Phone testPhone, то так нельзя - интерфейс Phone ничего не знает про метод `endCall()`:
    // testPhone.endCall();

    Smartphone iPhone = new Smartphone();

    // звоним маме со всех разновидностей телефонов
    callMom(testPhone);
    callMom(iPhone);

    // отправляем сообщение папе со всех разновидностей "Отправителя сообщений"
    textDad(testPager);
    textDad(iPhone);
  }

  public static void callMom(Phone phone) {
    phone.call("маме");
  }

  public static void textDad(Messenger messenger) {
    messenger.sendMessage("Привет!", "папе");
  }
}
