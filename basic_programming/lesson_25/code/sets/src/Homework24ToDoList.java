import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Homework24ToDoList {

  // программа - список дел
  // меню:
  // - добавить запись в конец
  // - посмотреть добавленные записи
  // - вычеркнуть запись (по номеру)
  // - выйти

  // Опционально:
  // - добавить запись по нужному номеру
  public static void main(String[] args) throws IOException {
    List<String> list = new ArrayList<>(); // дела -- записи
    while (true) {
      int command = readCommand();
      switch (command) {
        case 1 -> {
          addRecord(list);
          printRecords(list);
        }
        case 2 -> printRecords(list);
        case 3 -> removeRecord(list);
        case 4 -> {
          System.out.println("До свидания!");
          return; // выйти из метода main, то есть закрыть программу вообще
        }
      }
    }
  }

  // Метод должен прочитать строку и добавить её в конец списка `records`.
  public static void addRecord(List<String> records) throws IOException {
//    System.out.println("Добавляем запись\n"); // отладочный вывод
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите запись:");
    String record = br.readLine();
    records.add(record);
  }

  // Метод должен вывести все записи из готового списка `records`,
  // каждую в новой строке, и пронумеровать записи, начиная с единицы.
  public static void printRecords(List<String> records) {
//    System.out.println("Смотрим записи\n"); // отладочный вывод
    for (int i = 0; i < records.size(); ++i) {
      int number = i + 1;
      String record = records.get(i);
      System.out.println(number + ". " + record);
    }
    if (records.size() == 0) {
      System.out.println("Нет записей");
    }
    System.out.println();
  }

  // Метод должен прочитать номер записи (нумерация начинается с единицы) и удалить запись с таким
  // номером из списка `records`.
  public static void removeRecord(List<String> records) throws IOException {
    try {
//      System.out.println("Удаляем запись\n"); // отладочный вывод
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Введите номер записи для удаления: ");
      int number = Integer.parseInt(br.readLine());
      // 1 <= number <= records.size()
      if (number < 1 || number > records.size()) {
        System.out.println("Вы ввели некорректный номер");
        return; // выходим из метода - продолжать бессмысленно
      }
      int index = number - 1;
      // 0 <= index < records.size()
      records.remove(index);
    } catch (NumberFormatException e) {
      System.out.println("Вы ввели некорректный номер");
    }
  }

  public static void menu() {
    System.out.println("Меню:");
    System.out.println("1. Добавить запись в конец");
    System.out.println("2. Посмотреть добавленные записи");
    System.out.println("3. Вычеркнуть запись");
    System.out.println("4. Выйти");
  }

  public static int readCommand() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    menu();
    int command = 0; // воображаемая неправильная команда
    while (!(1 <= command && command <= 4)) { // пока команда неправильная
      System.out.print("Выберите команду: ");
      try {
        command = Integer.parseInt(br.readLine()); // читаем команду с клавиатуры
      } catch (NumberFormatException e) {
        System.out.println("Неправильный формат ввода: " + e.getMessage());
      }
      if (!(1 <= command && command <= 4)) {
        System.out.println("Введите номер команды от 1 до 4");
      }
    }
    return command;
  }
}
