package quest;

// абстрактный класс "Живое существо" - что-то, у чего есть здоровье
public abstract class Alive {

  public abstract int getHealth(); // получить здоровье персонажа
  public abstract void decreaseHealth(int difference);  // уменьшить здоровье на difference
  public abstract void increaseHealth(int difference); // увеличить здоровье на difference
  public abstract void levelUp(); // поднять уровень персонажа
}
