package quest;

// интерфейс "Волшебник" - что-то, что умеет творить волшебство
public interface Wizard {

  int mana = 0;

  default int getMana() { // получить количество оставшейся маны
    return mana;
  }

  void tryCharm(String charmName); // попытка использовать заклинание

  default void levelUp() { // поднять уровень волшебной силы
    System.out.println("Поднять уровень волшебной силы");
  }
}
