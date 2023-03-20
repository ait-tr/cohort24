package communications;

// класс "Дисковый телефон" реализует интерфейс "Телефон"
public class RotaryPhone implements Phone {

  @Override
  public void call(String phone) {
    System.out.println("Вы позвонили с дискового телефона по номеру " + phone);
  }

  public void endCall() {
    System.out.println("Вы повесили трубку");
  }
}
