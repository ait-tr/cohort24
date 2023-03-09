package homework_36;

public class Main {

  public static void main(String[] args) {
    Soda firstGlassOfSoda = new Soda(null);
    System.out.println(firstGlassOfSoda.getMyDrinkString());
    Soda secondGlassOfSoda = new Soda("");
    System.out.println(secondGlassOfSoda.getMyDrinkString());
    Soda thirdGlassOfSoda = new Soda("малина");
    System.out.println(thirdGlassOfSoda.getMyDrinkString());
  }
}
