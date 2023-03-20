package quest;

// абстрактный класс "Волшебник" - что-то, что умеет творить волшебство
public abstract class Wizard {

  public abstract int getMana(); // получить количество оставшейся маны
  public abstract void tryCharm(String charmName); // попытка использовать заклинание
  public abstract void levelUp(); // поднять уровень волшебной силы
}
