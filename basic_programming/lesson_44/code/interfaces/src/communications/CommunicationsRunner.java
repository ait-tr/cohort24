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
    Phone testPhone = new RotaryPhone();
    testPhone.call("112");
    // testPhone.endCall(); // так нельзя - интерфейс Phone ничего не знает про метод `endCall()`
  }
}
