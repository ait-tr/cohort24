package homework_44;

import java.util.ArrayList;
import java.util.List;

public class HomeworkMain {

  // # Задача 1
  //
  // Напишите интерфейсы "Умеет летать" `CanFly` с методом `fly()`,
  // "Умеет бегать" `CanRun` с методом `run` и
  // "умеет плавать" `CanSwim` с методом `swim`
  // и реализуйте их в классе "Супермен" `Superman`.
  //
  // # Задача 2
  //
  // Реализуйте **соответствующие** интерфейсы из предыдущей задачи
  // в классах "Человек", "Утка", "Пингвин" и "Самолёт".

  public static void main(String[] args) {
    List<CanFly> flyable = new ArrayList<>();
    List<CanRun> runnable = new ArrayList<>();
    List<CanSwim> swimmable = new ArrayList<>();

    Superman clarkKent = new Superman();
    flyable.add(clarkKent);
    runnable.add(clarkKent);
    swimmable.add(clarkKent);

    Human kirill = new Human();
    // flyable.add(kirill); // ошибка - человек не умеет летать, Human не имеет отношения к CanFly
    runnable.add(kirill);
    swimmable.add(kirill);

    Duck donald = new Duck();
    flyable.add(donald);
    runnable.add(donald);
    swimmable.add(donald);

    Penguin skipper = new Penguin();
    runnable.add(skipper);
    swimmable.add(skipper);

    Plane plane = new Plane();
    flyable.add(plane);

    System.out.println("Все полетели и я полетел!");
    for (CanFly flyingObject : flyable) {
      flyingObject.fly();
      // flyingObject.run(); // ошибка, мы ничего не знаем про run, у нас List<CanFly>
      if (flyingObject instanceof Superman superman) {
        System.out.print("ЭТО БЫЛ СУПЕРМЕН! Он умеет бегать: ");
        superman.run();
      }
    }
    System.out.println();

    System.out.println("Все побежали и я побежал!");
    for (CanRun runningObject : runnable) {
      runningObject.run();
    }
    System.out.println();

    swim(swimmable, "чём-то глубоком");
  }

  public static void swim(List<CanSwim> swimmable, String place) {
    System.out.println("Все поплыли и я поплыл...");
    for (CanSwim swimmingObject : swimmable) {
      swimmingObject.swim(place);
    }
  }
}
