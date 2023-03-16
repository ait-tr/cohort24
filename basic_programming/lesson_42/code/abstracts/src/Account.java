// Нам нужен класс "Учётная запись"
public class Account {

  // Менять их нельзя, но несколько человек могут регистрироваться с одной почтой
  private final String name;
  private final String email;
  // И у каждой учётной записи есть "репутация" - целое число
  private int reputation;

  // с именем и электронной почтой, которые задаются при создании.
  public Account(String name, String email) {
    this.name = name;
    this.email = email;
    reputation = 0;
  }

  // сеттеров не будет (или будут приватными) - поля нельзя менять по условию

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  /**
   * Увеличивает репутацию.
   *
   * @param  diff
   *         Разница между старым и новым значением, всегда положительная
   */
  public void increaseReputation(int diff) {
    if (diff > 0) {
      reputation += diff;
    }
  }

  /**
   * Уменьшает репутацию.
   *
   * @param  diff
   *         Разница между старым и новым значением, всегда положительная
   */
  public void decreaseReputation(int diff) {
    if (diff > 0) {
      reputation -= diff;
    }
  }

  public int getReputation() {
    return reputation;
  }

  @Override
  public String toString() {
    return String.format("name: %s, e-mail: %s", name, email);
  }

  // метод equals() сравнивает объекты: true, если равны, и false, если не равны
  // аргумент метода - то, с чем мы сравниваем объект (т.е. сравниваем this и obj)
  // правила:
  // 1. Объект должен быть равен самому себе
  // 2. При переопределении equals() надо переопределить hashCode()
  @Override
  public boolean equals(Object obj) {
    if (this == obj) { // ссылки this и obj ведут на один и тот же объект
      return true; // см. правило 1
    } // это оптимизация, иначе мы можем потратить много времени на сравнение с самим собой
    // пытаемся Object obj из 66-й строки превратить в Account other
    // пытаемся сделать что-то вроде `Account other = obj`, но безопасно
    if (! (obj instanceof Account other)) { // если obj - не Account или его потомок, а что-то ещё
      return false; // с "какими-то" объектами мы не сравниваем - очевидно, они не совпадают
    }
    // дальше мы сравниваем Account this и Account other из 72-й строки
    // условие задачи: Когда мы сравниваем учётные записи, мы должны сравнить имя и почту
    // условие задачи: На репутацию мы при сравнении не обращаем внимания
    // true = совпадает имя И совпадает e-mail (на репутацию внимания не обращаем)
    return this.name.equalsIgnoreCase(other.name) && this.email.equalsIgnoreCase(other.email);
  }

  // При переопределении equals() надо переопределить hashCode()
}
