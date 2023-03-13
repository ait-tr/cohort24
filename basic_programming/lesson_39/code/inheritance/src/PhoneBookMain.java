import java.util.ArrayList;
import java.util.List;
import phonebook.DigitalPerson;
import phonebook.Person;

public class PhoneBookMain {

  public static void main(String[] args) {
    List<Person> records = new ArrayList<>();
    records.add(new Person("Кирилл", "+1234567"));
    records.get(0).makeCall();
    records.add(new Person("Мефодий", "+2345678"));

    records.add(new DigitalPerson("Иннокентий", "kesha@gmail.com"));

    printAllRecords(records);
  }

  public static void printAllRecords(List<Person> records) {
    System.out.println();
    System.out.println("Записи в телефонной книге:");
    for (Person person : records) {
      System.out.println(person.getPersonString());
    }
  }
}
