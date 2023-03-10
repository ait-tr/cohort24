package students;

public class Student {

  // final - нельзя менять
  // private - доступен только внутри студента
  // static - общий для всех студентов
  final private static char SEP = ','; // определяем разделитель как символ запятой
  private String name;
  private String group;
  private String eMail;

  public Student(String name, String group) {
    this.name = name;
    this.group = group;
    this.eMail = null; // eMail'а нет
  }

  public Student(String name, String group, String eMail) {
    this.name = name;
    this.group = group;
    this.eMail = eMail;
  }

  public String getName() {
    return name;
  }

  public String getGroup() {
    return group;
  }

  public String getEMail() {
    return eMail;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
  // и вернуть получившегося студента
  // метод статический - вызывается сам по себе и возвращает нового прочитанного студента
  public static Student parseStudent(String group, String line) {
    int sepIndex = line.indexOf(SEP); // ищем запятую в переданной строке
    if (sepIndex != -1) {
      // есть запятая - строка "имя,e-mail"
    } else {
      // нет запятой - строка "имя"
    }
  }
}
