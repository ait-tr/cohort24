package communications;

// класс "Смартфон" реализует интерфейсы "Телефон" и "Отправитель сообщений"
public class Smartphone implements Phone, Messenger {

  @Override
  public void call(String phone) {
    System.out.println("Вы позвонили со смартфона по телефону " + phone);
  }

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Вы отправили сообщение " + message + " со смартфона на адрес " + address);
  }
}
