package phonebook;

// создать базовый класс Person для записи информации в телефонной книге
// и будет метод "позвонить"

// создать класс-наследник DigitalPerson, в котором к полям добавится электронная почта
// и добавится метод "написать письмо"

public class Person {

  private static int counter = 0;
  final private int id;
  private String name;
  private int age;
  private String phone;

  public Person(String name, String phone) {
    this.id = ++counter; // увеличить и записать результат
    this.name = name;
    this.phone = phone;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPersonString() {
//    return String.format("%d: %s (%d) - %s", id, name, age, phone);
    return String.format("%d: %s- %s", id, name, phone);
  }

  public void makeCall() {
    System.out.printf("Звоним %s по телефону %s%n", name, phone);
  }
}
