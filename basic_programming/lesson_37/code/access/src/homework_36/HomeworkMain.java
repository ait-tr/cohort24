package homework_36;

public class HomeworkMain {

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

    int a = 2;
    int b = 4;
    int c = 6;
    // используем статический метод
    System.out.println(Triangle.checkSides(a, b, c) ? "YES" : "NO");
  }
}
