public class Pet {

  // Создать класс `Pet` (домашнее животное). В классе должны быть:
  // - `enum Kind` для вида животного (`DOG`, `CAT`, `OTHER`);
  // - поля:
  //   - "вид животного" (тип `Kind`),
  //   - "кличка" (тип `String`),
  //   - "дата рождения" (тип `String`),
  //   - вес (тип `double`);
  // - конструктор, сеттеры, геттеры;
  // - статический метод для создания животного при прочтении данных из строки `"dog,кличка"`,
  //   `"cat,кличка,вес"`, `"turtle,кличка,вес,дата рождения"`.
  //
  // Создать класс `Main`, в котором данные будут считываться с консоли и красиво выводиться на
  // экран.
  //
  // Формат входных данных: количество строк с записями о домашних животных, затем сами записи
  // в описанном формате.
  enum Kind {
    DOG,
    CAT,
    OTHER,
  }

  Kind kind;
  String name;
  String dateOfBirth;
  double weight;

  public Pet(Kind kind, String name, String dateOfBirth, double weight) {
    this.kind = kind;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.weight = weight;
  }

  // сеттера для kind нет - тип не меняется

  public void setName(String name) {
    this.name = name;
  }

  // дату рождения могут сначала не знать, а потом узнать и добавить к существующей записи
  // поэтому сеттер есть
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Kind getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public double getWeight() {
    return weight;
  }
}
