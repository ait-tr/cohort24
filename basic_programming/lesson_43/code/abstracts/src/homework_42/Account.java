package homework_42;

public class Account {

  private final String name;
  private final String email;
  private int reputation;

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
    return String.format("name: %s, e-mail: %s, reputation: %s", name, email, reputation);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (! (obj instanceof Account other)) {
      return false;
    }
    return this.name.equalsIgnoreCase(other.name) && this.email.equalsIgnoreCase(other.email);
  }

  @Override
  public int hashCode() {
    return name.hashCode() * email.hashCode();
  }
}
