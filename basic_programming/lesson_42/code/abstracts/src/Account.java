// Когда мы сравниваем учётные записи, мы должны сравнить имя и почту
// На баланс мы при сравнении не обращаем внимания

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
}
