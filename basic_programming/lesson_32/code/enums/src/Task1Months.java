import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task1Months {

  final public static String SEP = ","; // SEP = separator = разделитель

  // прочитать месяцы и дни из файла inputFile
  public static Map<String, Integer> readMonthsFromFile(File inputFile) throws IOException {
    Map<String, Integer> months = new HashMap<>(); // словарь с месяцами и днями
    BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFile));

    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      // row - прочитанная из файла inputFile строка
      int sepPoz = row.indexOf(SEP);
      String month = row.substring(0, sepPoz);
      // число дней написано в строке row с позиции после SEP до конца
      int days = Integer.parseInt(row.substring(sepPoz + 1));
      months.put(month, days);
    }

    inputFileReader.close(); // закрываем файл inputFile, открытый в inputFileReader
    return months; // возвращаем готовый словарь с месяцами и днями
  }

  // программа получает название месяца
  // возвращает количество дней
  public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the month: "); // Введите название месяца
    String month = inputReader.readLine(); //
    String monthToLook = month.toLowerCase(); // месяц для поиска в словаре

    Map<String, Integer> monthDays = readMonthsFromFile(new File("res/months.csv"));

    if (monthDays.containsKey(monthToLook)) {
      // "Месяц %s содержит %d дней"
      System.out.printf("The month '%s' contains %d days%n", month, monthDays.get(monthToLook));
    } else {
      System.out.println("No such month: " + month); // Нет такого месяца
    }
  }
}
