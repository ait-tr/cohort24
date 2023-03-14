package phones;

public class OldPhone extends Phone {

  @Override
  public void call(String phoneNumber) {
    System.out.println("== Пытаемся позвонить по 'старому' аппарату ==");
    if (phoneNumber.contains("+")) {
      System.out.println("На нашем аппарате нет '+'");
      return;
    }
    System.out.println("- Поднимаем трубку");
    System.out.println("- Дожидаемся гудка");
    System.out.println("- Набираем цифры по одной");
    // а дальше звоним "как обычный телефон"
    // super.call(phoneNumber) - вызов метода из супер-класса Phone
    super.call("+" + phoneNumber); // вывод "мы звоним по телефону ..."
  }
}
