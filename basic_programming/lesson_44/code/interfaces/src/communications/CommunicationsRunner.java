package communications;

public class CommunicationsRunner {

  public static void main(String[] args) {
    // new Phone() написать нельзя; Phone - это интерфейс
    // new Messenger() написать нельзя; Messenger - это интерфейс
    Pager testPager = new Pager("Тестовый исходный адрес");
    testPager.sendMessage("Тестовое сообщение", "кому-то");

    RotaryPhone testPhone = new RotaryPhone();
    testPhone.call("112");
  }
}
