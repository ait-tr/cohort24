import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBook {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // узнаём количество записей
    int size = 0;
    while (size <= 0) {
      System.out.print("Введите положительное количество записей: ");
      try {
        size = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Неправильный формат числа: " + e.getMessage());
        size = -1;
      }
    }

    // читаем (с клавиатуры) записи
    String[] names = new String[size];
    String[] phones = new String[size];
    for (int i = 0; i < size; ++i) {
      System.out.println("Введите имя для записи № " + (i + 1)); // нумерация с 1, индексы с 0
      names[i] = br.readLine();
      System.out.println("Введите номер телефона для записи № " + (i + 1));
      phones[i] = br.readLine();
    }

    // позволяем посмотреть все записи или определённую запись,
    // или выйти из программы
    while (true) {
      printHelp();
      int command;
      try {
        command = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Неправильный формат числа: " + e.getMessage());
        continue;
      }

      switch (command) {
        case -1:
          return; // выход из программы
        case 0:
          printAllRecords(names, phones);
          break;
        default:
          try {
            printRecord(names, phones, command);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный номер записи: " + command);
          }
          break;
      }
    }
  }

  public static void printHelp() {
    System.out.println("""
        
        Справка:
        -1 - выйти
        0 - вывести все записи
        любое другое число - вывести запись с соответствующим номером""");
  }

  public static void printRecord(String[] names, String[] phones, int number) {
    int i = number - 1;
    System.out.println(number + ". " + names[i] + ": " + phones[i]);
  }

  public static void printAllRecords(String[] names, String[] phones) {
    for (int no = 1; no <= names.length; ++no) {
      printRecord(names, phones, no);
    }
  }
}
