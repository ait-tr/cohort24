package homework_44;

public class Penguin implements CanRun, CanSwim {

  @Override
  public void run() {
    System.out.println("Пингвин бежит");
  }

  @Override
  public void swim(String place) {
    System.out.println("Пингвин плывёт в " + place);
  }
}
