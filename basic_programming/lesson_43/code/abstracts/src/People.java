import people.Human;
import people.Man;
import people.Woman;

public class People {

  public static void main(String[] args) {
    Human husband = new Man("Иван");
    Human wife = new Woman("Мария");
    System.out.println(husband + " + " + wife);
    husband.retire(); // муж уходит на пенсию
    System.out.println(husband + " + " + wife);
  }
}
