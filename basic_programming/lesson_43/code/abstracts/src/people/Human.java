package people;

public class Human {

  private String name;
  private boolean retired;

  public Human(String name) {
    this.name = name;
    this.retired = false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // геттер
  public boolean getRetired() {
    return retired;
  }

  // сеттера нет, но есть метод
  // выйти на пенсию
  public void retire() {
    this.retired = true;
  }
}
