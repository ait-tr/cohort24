import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Homework32_2 {

  // Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень)
  // и укажет, к какому именно времени года относится выбранный месяц.

  enum Month {
    UNKNOWN, // неизвестный месяц
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }

  enum Season { // ВремяГода
    WINTER, // ЗИМА
    SPRING, // ВЕСНА
    SUMMER, // ЛЕТО
    FALL, // ОСЕНЬ // AUTUMN - GB, FALL - US
  }

  public static Month readMonth(String title) {
    try {
      return Month.valueOf(title.toUpperCase());
    } catch (IllegalArgumentException e) {
      return Month.UNKNOWN; // поймали исключение - не смогли превратить строку в значение enum
    }
  }

  public static Map<Month, Integer> buildMonthsMap() { // сделать словарь с месяцами и днями
    Map<Month, Integer> months = new HashMap<>(); // словарь с месяцами и днями

    months.put(Month.JANUARY, 31);
    months.put(Month.FEBRUARY, 28);
    months.put(Month.MARCH, 31);
    months.put(Month.APRIL, 30);
    months.put(Month.MAY, 31);
    months.put(Month.JUNE, 30);
    months.put(Month.JULY, 31);
    months.put(Month.AUGUST, 31);
    months.put(Month.SEPTEMBER, 30);
    months.put(Month.OCTOBER, 31);
    months.put(Month.NOVEMBER, 30);
    months.put(Month.DECEMBER, 31);

    return months; // возвращаем готовый словарь с месяцами и днями
  }

  public static Map<Month, Season> buildSeasons() {
    Map<Month, Season> seasons = new HashMap<>();

    seasons.put(Month.JANUARY, Season.WINTER);
    seasons.put(Month.FEBRUARY, Season.WINTER);
    seasons.put(Month.MARCH, Season.SPRING);
    seasons.put(Month.APRIL, Season.SPRING);
    seasons.put(Month.MAY, Season.SPRING);
    seasons.put(Month.JUNE, Season.SUMMER);
    seasons.put(Month.JULY, Season.SUMMER);
    seasons.put(Month.AUGUST, Season.SUMMER);
    seasons.put(Month.SEPTEMBER, Season.FALL);
    seasons.put(Month.OCTOBER, Season.FALL);
    seasons.put(Month.NOVEMBER, Season.FALL);
    seasons.put(Month.DECEMBER, Season.WINTER);

    return seasons;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the month: "); // Введите название месяца
    String month = inputReader.readLine();
    Month monthToLook = readMonth(month); // месяц для поиска в словаре

    Map<Month, Integer> monthDays = buildMonthsMap();

    if (monthDays.containsKey(monthToLook)) {
      // "Месяц %s содержит %d дней"
      System.out.printf("The month '%s' contains %d days%n", month, monthDays.get(monthToLook));

      // из-за UNKNOWN сдвинулись индексы
      System.out.printf("The month '%s' has ordinal number %d%n", month, monthToLook.ordinal());

      Map<Month, Season> seasons = buildSeasons();
      // Этот месяц - часть времени года '%s'
      System.out.printf("This month is a part of a '%s' season%n", seasons.get(monthToLook));

      int nextMonthIndex = monthToLook.ordinal() + 1;
      // из-за UNKNOWN сдвинулись индексы
      if (nextMonthIndex == 13) {
        nextMonthIndex = 1;
      }
      Month nextMonth = Month.values()[nextMonthIndex];

      System.out.printf("The next month is '%s'%n", nextMonth);
      System.out.printf("The next month is a part of '%s' season%n", seasons.get(nextMonth));
      System.out.printf("It has %d days", monthDays.get(nextMonth));


    } else {
      System.out.println("No such month: " + month); // Нет такого месяца
    }
  }
}
