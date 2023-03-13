public class Pet {

  // Создать класс `Pet` (домашнее животное). В классе должны быть:
  // - `enum Kind` для вида животного (`DOG`, `CAT`, `OTHER`);
  // - поля:
  //   - "вид животного" (тип `Kind`),
  //   - "кличка" (тип `String`),
  //   - "дата рождения" (тип `String`),
  //   - вес (тип `double`);
  // - конструктор, сеттеры, геттеры;
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

  final private Kind kind; // тип точно не будет меняться
  private String name;
  private String dateOfBirth;
  private double weight;

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

  // - статический метод для создания животного при прочтении данных из строки `"dog,кличка"`,
  //   `"cat,кличка,вес"`, `"turtle,кличка,вес,дата рождения"`.
  public static Pet parsePet(String line) {
    String[] parts = line.split(","); // разбить строку на подстроки по запятым
    Kind kind = parseKind(parts[0]);
    String name = parts[1];
//    double weight;
//    if (parts.length > 2) {
//      weight = Double.parseDouble(parts[2]);
//    } else {
//      weight = 0.0;
//    }
    double weight = parts.length > 2 ? Double.parseDouble(parts[2]) : 0.0;
    String dateOfBirth = parts.length > 3 ? parts[3] : null;
    return new Pet(kind, name, dateOfBirth, weight);
  }

  private static Kind parseKind(String line) {
    try {
      return Kind.valueOf(line.toUpperCase());
    } catch (IllegalArgumentException e) {
      return Kind.OTHER;
    }
  }
}
