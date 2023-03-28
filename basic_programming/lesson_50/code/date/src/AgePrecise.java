import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class AgePrecise {

  public static void main(String[] args) throws IOException {
    Calendar calendar = new GregorianCalendar(); // в календарь можно передать конкретную дату

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    System.out.println("Рада познакомиться, " + name + "! А когда ты родился, напиши дату?");
    String dateStr = br.readLine();
    // класс для чтения и печати Date
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    try {
      Date birthday = formatter.parse(dateStr);
      DateFormat ruDateFormatter = new SimpleDateFormat("d MMMM yyyy",
          Locale.forLanguageTag("ru-RU"));
      System.out.println("Я правильно поняла? " + ruDateFormatter.format(birthday) + "?");

      // третий способ работы с датами: использование пакета java.time
      // превращение java.util.Date в java.time.LocalDate - через класс java.time.Instant
      LocalDate newBirthday = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//      LocalDate newBirthday = LocalDate.from(Instant.ofEpochMilli(birthday.getTime()));
      int age = Period.between(newBirthday, LocalDate.now()).getYears();
      System.out.println("Тебе " + age + " лет");
    } catch (ParseException e) {
      System.out.println("Некорректный формат даты: " + dateStr);
    }
  }
}
