package communications;

public class Pager implements Messenger {

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Пейджер: вы отправили сообщение '" + message + "' адресату " + address);
  }
}
