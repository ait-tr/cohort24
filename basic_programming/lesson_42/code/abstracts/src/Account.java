// Нам нужен класс "Учётная запись"
// с именем и электронной почтой, которые задаются при создании.
// Менять их нельзя, но несколько человек могут регистрироваться с одной почтой

// И у каждой учётной записи есть "репутация" - целое число

// Когда мы сравниваем учётные записи, мы должны сравнить имя и почту
// На баланс мы при сравнении не обращаем внимание
public class Account {

  private final String name;
  private final String email;

  public Account(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // сеттеров не будет (или будут приватными) - поля нельзя менять по условию


  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
