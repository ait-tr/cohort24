package homework_40;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // При попытке вывести объект этого класса на экран должна выводиться строка
  // "Человек по имени ...".
  @Override // перезаписываем Object.toString()
  public String toString() {
    return "Человек по имени " + name;
  }

  // метод "поприветствовать", который выводит строку: "Я родился!"
  public void greet() {
    System.out.println("Я родился!");
  }
}
