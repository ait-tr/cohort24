import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
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
      // TODO посчитать возраст
    } catch (ParseException e) {
      System.out.println("Некорректный формат даты: " + dateStr);
    }
  }
}
