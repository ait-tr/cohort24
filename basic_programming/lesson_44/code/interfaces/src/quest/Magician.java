package quest;

public class Magician extends Alive, Wizard {

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
}
