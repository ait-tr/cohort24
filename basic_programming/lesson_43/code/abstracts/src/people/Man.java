package people;

public class Man extends Human {

  private final static int RETIREMENT_AGE = 67; // пенсионный возраст

  public Man(String name) {
    super(name); // super - обращение к базовому (родительскому) классу
    // new Man - это значит, что автоматически создастся new Human
  }

  // сеттера для retired нет, но есть метод
  // выйти на пенсию
  @Override
  public void retire() {
    if (getAge() >= RETIREMENT_AGE) {
      this.retired = true;
    }
  }
}
