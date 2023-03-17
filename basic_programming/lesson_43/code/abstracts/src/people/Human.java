package people;

public class Human {

  private String name;
  protected boolean retired;
  private int age;

  // члены класса нельзя перезаписать, как методы

  // если сделать статический член класса и перезаписать ЕГО
  // в потомке, то перезапишется член базового класса!

  public Human(String name) {
    this.name = name;
    this.retired = false;
    this.age = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getRetired() {
    return retired;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    String result = name + " (" + age + ")";
    if (retired) {
      result += " (на пенсии)";
    }
    return result;
  }

  public void retire() {
    // как бы "общий" выход на пенсию
  }
}
