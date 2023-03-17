package people;

public class Woman extends Human {

  private final static int RETIREMENT_AGE = 65; // пенсионный возраст

  public Woman(String name) {
    super(name);
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
