package people;

public abstract class Human {

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
    String result = name + " (" + age + ")"; // "Иван" + " (" + 90 + ")" == "Иван (90)"
    if (retired) {
      result += " (на пенсии)"; // result += " (на пенсии)" --> result = result + " (на пенсии)"
      // --> result = "Иван (90)" + " (на пенсии)" = "Иван (90) (на пенсии)"
    }
    return result;
  }

  public abstract void retire(); // как бы "общий" выход на пенсию
  // ключевое слово abstract означает "абстрактный" - метод есть, а реализации нет
  // реализация будет у потомков

  // абстрактный метод нельзя вызвать сам по себе - его нет
  // можно вызвать только его переопределение в каком-то из классов-потомков

  // это не метод, а обещание, что такой метод будет

  // если в классе есть абстрактные методы, то и класс обязан быть абстрактным - "какой-то человек"
  // Класс становится шаблоном, по которому нельзя сделать объект
  // С абстрактным классом нельзя написать new - в нашем случае нельзя создать "просто человека"
}
