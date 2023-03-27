import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

  public static void main(String[] args) throws IOException {
    // Date - количество миллисекунд с момента 00:00:00 UTC 01.01.1970
    // например, 1679939243000 миллисекунд - это 2023-03-27 17:47:23.000 UTC

    // Date.getYear() вернёт год. Но:
    // - он deprecated (устаревший) и больше не поддерживается
    // - он возвращает количество лет, прошедшее с 1900 года

    Calendar calendar = new GregorianCalendar(); // календарь с текущими датой и временем
//    Date current = calendar.getTime(); // дата и время календаря
//    calendar.set(Calendar.DAY_OF_MONTH, 1);
//    Date first = calendar.getTime();
//    calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
//    Date tuesday = calendar.getTime();
//    System.out.println("Сегодня: " + current);
//    System.out.println("Первое число: " + first);
//    System.out.println("Вторник: " + tuesday);
    int currentYear = calendar.get(Calendar.YEAR); // вместо Date.getYear() безо всяких поправок

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    // женский род, потому что слово "программа" женского рода
    System.out.println("Рада познакомиться, " + name + "! А какого ты года рождения?");
    int year = Integer.parseInt(br.readLine());
//    if (year > currentYear) {
//      System.out.println("Извините, дата рождения не может быть в будущем!");
//    }

    int age = currentYear - year;
    System.out.println("Похоже, тебе " + age + " лет. Или " + (age - 1) + "!");
  }
}
