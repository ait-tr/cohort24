import people.Human;
import people.Man;
import people.Woman;

public class People {

  public static void main(String[] args) {
    // Human somebody = new Human(); // так нельзя; Human - абстрактный класс
    Human husband = new Man("Иван");
    Human wife = new Woman("Мария");
    System.out.println(husband + " + " + wife);
    husband.retire(); // муж не уходит на пенсию - возраст 0
    System.out.println("Муж не уходит на пенсию: " + husband);
    husband.setAge(90);
    System.out.println("Муж повзрослел: " + husband);
    husband.retire(); // муж не уходит на пенсию - возраст 0
    System.out.println("Муж уходит на пенсию: " + husband);
    System.out.println(husband + " + " + wife);
  }
}
