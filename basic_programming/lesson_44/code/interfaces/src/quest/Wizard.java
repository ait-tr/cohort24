package quest;

// интерфейс "Волшебник" - что-то, что умеет творить волшебство
public interface Wizard {

  int getMana(); // получить количество оставшейся маны

  void tryCharm(String charmName); // попытка использовать заклинание

  void levelUp(); // поднять уровень волшебной силы
}
