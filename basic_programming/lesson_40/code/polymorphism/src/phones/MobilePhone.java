package phones;

public class MobilePhone extends Phone {

  @Override
  public void call(String phoneNumber) {
    System.out.println("== Пытаемся позвонить по мобильному аппарату ==");
    System.out.println("- Проверяем наличие сети");
    super.call(phoneNumber);
  }
}
