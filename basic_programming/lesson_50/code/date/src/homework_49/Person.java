package homework_49;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

  private static final DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
  private String name;
  private final Date birthday;

  // String birthday - дата рождения в виде строки в формате "ДД.ММ.ГГГГ".
  public Person(String name, String birthday) throws ParseException {
    this.name = name;
    this.birthday = formatter.parse(birthday);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return name + " (дата рождения: " + formatter.format(birthday) + ")";
  }
}
