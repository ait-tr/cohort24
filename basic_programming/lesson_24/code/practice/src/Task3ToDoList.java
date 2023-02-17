import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3ToDoList {

  // программа - список дел
  // меню:
  // - добавить запись в конец
  // - посмотреть добавленные записи
  // - вычеркнуть запись (по номеру)
  // - выйти

  // Опционально:
  // - добавить запись по нужному номеру
  public static void main(String[] args) throws IOException {
    List<String> records = new ArrayList<>(); // дела -- записи
    while (true) {
      int command = readCommand();
      switch (command) {
        case 1 -> addRecord(records);
        case 2 -> printRecords(records);
        case 3 -> removeRecord(records);
        case 4 -> {
          System.out.println("До свидания!");
          return; // выйти из метода main, то есть закрыть программу вообще
        }
      }
    }
  }

  public static void addRecord(List<String> records) {
    System.out.println("Добавляем запись\n"); // отладочный вывод
  }

  public static void printRecords(List<String> records) {
    System.out.println("Смотрим записи\n"); // отладочный вывод
  }

  public static void removeRecord(List<String> records) {
    System.out.println("Удаляем запись\n"); // отладочный вывод
    records.remove(0);
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
