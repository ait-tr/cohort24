package students;

public class Student {

  private String name;
  private String group;
  private String eMail;
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
}
