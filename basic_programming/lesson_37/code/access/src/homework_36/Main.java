package homework_36;

public class Main {

  public static void main(String[] args) {
    Soda firstGlassOfSoda = new Soda(null);
    System.out.println(firstGlassOfSoda.getMyDrinkString());
    Soda secondGlassOfSoda = new Soda("");
    System.out.println(secondGlassOfSoda.getMyDrinkString());
    Soda thirdGlassOfSoda = new Soda("малина");
    System.out.println(thirdGlassOfSoda.getMyDrinkString());

    Triangle t1 = new Triangle(-1, 2, 3); // отрицательная сторона
    Triangle t2 = new Triangle(1, 2, 3); // не выполняется неравенство треугольника
    Triangle t3 = new Triangle(3, 4, 5); // всё хорошо
  }
}
