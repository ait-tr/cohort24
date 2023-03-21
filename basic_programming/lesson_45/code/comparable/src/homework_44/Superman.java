package homework_44;

public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Супермен летит");
  }

  @Override
  public void run() {
    System.out.println("Супермен бежит");
  }

  @Override
  public void swim(String place) {
    System.out.println("Супермен плывет в " + place);
  }
}
