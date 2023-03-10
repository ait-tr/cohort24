package students;

public class Student {

  String name;
  String group;
  String eMail;
  // String eMail = ""; // так тоже можно

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
}
