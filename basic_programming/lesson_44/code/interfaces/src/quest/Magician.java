package quest;

// extends (расширяет) - для класса
// implements (реализует) - для интерфейса
// Один класс может реализовывать несколько интерфейсов одновременно
public class Magician implements Alive, Wizard {

  @Override
  public int getHealth() {
    return 0;
  }

  @Override
  public void increaseHealth(int difference) {

  }

  // В случае конфликтующих default описаний методов в интерфейсе, мы ОБЯЗАНЫ
  // перезаписать этот метод в дочернем классе и ЯВНО сказать, что именно мы хотим сделать
  @Override
  public void levelUp() {
    Alive.super.levelUp(); // метод levelUp из интерфейса Alive
    Wizard.super.levelUp(); // метод levelUp из интерфейса Wizard
  }

  @Override
  public void decreaseHealth(int difference) {

  }

  @Override
  public int getMana() {
    return Wizard.super.getMana();
  }

  @Override
  public void tryCharm(String charmName) {

  }
}
