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

  @Override
  public void decreaseHealth(int difference) {

  }

  @Override
  public int getMana() {
    return 0;
  }

  @Override
  public void tryCharm(String charmName) {

  }

  @Override
  public void levelUp() {

  }
}
