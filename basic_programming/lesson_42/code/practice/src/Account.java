import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    return String.format("name: %s, e-mail: %s, reputation: %s", name, email, reputation);
  }

  // метод equals() сравнивает объекты: true, если равны, и false, если не равны
  // аргумент метода - то, с чем мы сравниваем объект (т.е. сравниваем this и obj)
  // правила:
  // 1. Объект должен быть равен самому себе
  // 2. При переопределении equals() надо переопределить hashCode()
  @Override // перезаписываем public boolean Object.equals(Object obj)
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
  // метод equals() сравнивает объекты внутри системных методов Java:
  // например:
  // - ищет объект в списке (List.indexOf())
  // - проверяет совпадение ключей словаря или элементов множества
  // - ...
  // Следовательно, если мы хотим научить Java сравнивать наши объекты, мы обязаны перезаписать
  // `public boolean Object.equals(Object obj)`, а следовательно, и `public int Object.hashCode()`
  // если метод не переписать, то Object.equals(Object obj) сравнивает ссылки

  // При переопределении equals() надо переопределить hashCode()
  // Правила:
  // 1. Для одинаковых объектов НУЖНО возвращать одинаковое число
  // 2. Хорошо бы возвращать разные числа для РАЗНЫХ объектов
  // Что такое одинаковые - см. equals()
  @Override
  public int hashCode() {
    return name.hashCode() * email.hashCode();
    // Idea сгенерирует return Objects.hash(name, email);
  }
  // Метод public int Object.hashCode() используется для ускорения работы всего, у чего в названии
  // есть слово Hash
  // при попытке выяснить, есть ли такой объект в коллекции, сначала вычисляется хэш объекта
  // и потом объект сравнивают только с уже известными объектами с таким же хэшем
  // Если хэш разный, то объекты считаются разными и даже не сравниваются (только внутри Hash*)
  // Если хэш одинаковый, то объекты сравниваются через equals()
  // Идеально, если у всех разных объектов будут разные хэши
  // Если все хэши одинаковые, то Hash* работает ОЧЕНЬ медленно - с таким же успехом можно
  // складывать в список и перебирать вручную, каждый сравнивая с каждым
  // оригинальный Object.hashCode() для разных ссылок выдаёт разные хэши,
  // приходится перезаписывать, чтобы для разных в памяти, но равных через equals() объектов
  // хэш получался одинаковым

  // equals() и hashCode() обычно генерируют и НЕ пишут самостоятельно
}
