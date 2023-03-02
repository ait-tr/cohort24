import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Homework32_1 {

  // Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень)
  // и укажет, к какому именно времени года относится выбранный месяц.

  enum Month {
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

  public static Season findSeason(Month month) {
    // классический switch:
//    switch (month) {
//      case DECEMBER:
//      case JANUARY:
//      case FEBRUARY:
//        return Season.WINTER;
//        // после return не нужен break
//      case MARCH:
//      case APRIL:
//      case MAY:
//        return Season.SPRING;
//      case JUNE:
//      case JULY:
//      case AUGUST:
//        return Season.SUMMER;
//      case SEPTEMBER:
//      case OCTOBER:
//      case NOVEMBER:
//        return Season.FALL;
//    }
//    return Season.WINTER; // этого никогда не произойдёт

    // enhanced (улучшенный) switch - вместо ':' - '->', есть {}, нет break
//    switch (month) {
//      case DECEMBER, JANUARY, FEBRUARY -> {
//        return Season.WINTER;
//      }
//      case MARCH, APRIL, MAY -> {
//        return Season.SPRING;
//      }
//      case JUNE, JULY, AUGUST -> {
//        return Season.SUMMER;
//      }
//      case SEPTEMBER, OCTOBER, NOVEMBER -> {
//        return Season.FALL;
//      }
//    }
//    return Season.WINTER; // этого никогда не произойдёт

    // switch expression - выражение с оператором switch:
    // switch ставится внутрь выражения и ведёт себя как маленькая функция -
    // получает аргумент и возвращает значение
    // после '->' сразу пишем значение, {} не нужны
    return switch (month) {
      case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
      // после return не нужен break
      case MARCH, APRIL, MAY -> Season.SPRING;
      case JUNE, JULY, AUGUST -> Season.SUMMER;
      case SEPTEMBER, OCTOBER, NOVEMBER -> Season.FALL;
    };
  }

  public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the month: "); // Введите название месяца
    String month = inputReader.readLine();
    Month monthToLook = Month.valueOf(month.toUpperCase()); // месяц для поиска в словаре

    Map<Month, Integer> monthDays = buildMonthsMap();

    if (monthDays.containsKey(monthToLook)) {
      // "Месяц %s содержит %d дней"
      System.out.printf("The month '%s' contains %d days%n", month, monthDays.get(monthToLook));

      System.out.printf("The month '%s' has ordinal number %d%n", month, monthToLook.ordinal() + 1);

      // Этот месяц - часть времени года '%s'
      System.out.printf("This month is a part of a '%s' season%n", findSeason(monthToLook));

      int nextMonthIndex = (monthToLook.ordinal() + 1);
      Month nextMonth = Month.values()[nextMonthIndex % Month.values().length];

      System.out.printf("The next month is '%s'%n", nextMonth);
      System.out.printf("It has %d days", monthDays.get(nextMonth));
    } else {
      System.out.println("No such month: " + month); // Нет такого месяца
    }
  }
}
