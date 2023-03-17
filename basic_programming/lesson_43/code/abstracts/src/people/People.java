package people;

public class People {

  public static void main(String[] args) {
    Human husband = new Man("Иван");
    Human wife = new Woman("Мария");
    System.out.println(husband.getName() + " + " + wife.getName());
  }
}
