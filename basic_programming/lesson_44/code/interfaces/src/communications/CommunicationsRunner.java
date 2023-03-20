package communications;

public class CommunicationsRunner {

  public static void main(String[] args) {
    // new Phone() написать нельзя; Phone - это интерфейс
    // new Messenger() написать нельзя; Messenger - это интерфейс
    Pager testPager = new Pager();
    testPager.sendMessage("Тестовое сообщение", "кому-то");
  }
}
