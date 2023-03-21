package homework_44;

public class Human implements CanRun, CanSwim {

  @Override
  public void run() {
    System.out.println("Человек бежит");
  }

  @Override
  public void swim(String place) {
    System.out.println("Человек плывёт в " + place);
  }
}
