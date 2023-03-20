package communications;

public interface Messenger {

  // public final - атрибуты интерфейса - только КОНСТАНТЫ
  String DEFAULT_MESSAGE = "Сообщение по умолчанию";
  // использовать можно, менять нельзя
  // геттер не нужен (public), сеттера быть не может

  void sendMessage(String message, String address);
}
