package test;

public class Main {

  public static void main(String[] args) {
    makeSwim(() -> System.out.println("Я плыву. А что я?"));

    // () -> System.out.println("Я плыву. А что я?")
    // это и будет методом
    // @Override
    // public void swim() {
    //   System.out.println("Я плыву. А что я?");
    // }
  }

  public static void makeSwim(Swimmable person) {
    person.swim();
  }
}
