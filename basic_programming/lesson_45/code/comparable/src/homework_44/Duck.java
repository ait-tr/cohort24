package homework_44;

public class Duck implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Утка летит");
  }

  @Override
  public void run() {
    System.out.println("Утка бежит");
  }

  @Override
  public void swim(String place) {
    System.out.println("Утка плывёт в " + place);
  }
}
