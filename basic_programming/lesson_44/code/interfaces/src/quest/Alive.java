package quest;

// интерфейс "Живое существо" - что-то, у чего есть здоровье
// интерфейс - абстрактный набор (абстрактных) публичных методов
public interface Alive {

  int getHealth(); // получить здоровье персонажа

  void decreaseHealth(int difference);  // уменьшить здоровье на difference

  void increaseHealth(int difference); // увеличить здоровье на difference

  default void levelUp() { // поднять уровень персонажа
    System.out.println("поднять уровень персонажа");
  }
}
