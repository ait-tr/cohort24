import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task1PhoneBook {

  public static void main(String[] args) throws IOException {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // прочитать количество записей в телефонной книге
      System.out.print("Введите количество записей: ");
      int n = Integer.parseInt(br.readLine());


      Map<String, String> phoneBook = new HashMap<>();
      for (int i = 1; i <= n; ++i) {
        // для каждой записи прочитать имя и телефон - в отдельных строках
        System.out.println("Введите имя для записи номер " + i + ":");
        String name = br.readLine();

        System.out.println("Введите номер телефона:");
        String phone = br.readLine(); // читаем строку, чтобы сохранить знаки

        phoneBook.put(name.toLowerCase(), phone);
        // ключ - name маленькими буквами,
        // значение - phone
      }

      // прочитать имя и вывести номер телефона
      System.out.println("Введите имя для поиска:");
      String name = br.readLine();
      if (phoneBook.containsKey(name.toLowerCase())) {
        System.out.println("Номер телефона: " +  phoneBook.get(name.toLowerCase()));
      } else {
        System.out.println("В телефонной книге нет такого имени: " + name);
      }

      // прочитать номер телефона и вывести имя
      System.out.println("Введите номер телефона для поиска:");
      String phone = br.readLine();
      if (phoneBook.containsValue(phone)) { // если в словаре есть такое значение
                                            // есть номер телефона в телефонной книге
        // словарь.keySet() - множество ключей
        // словарь.valueSet() - множество значений
        // перебор имён (ключей в множестве ключей):
        for (String recordName : phoneBook.keySet()) { // перебираем все ключи словаря
                                                       // перебираем все имена в телефонной книге
          String recordPhone = phoneBook.get(recordName); // получаем значение для каждого ключа
                                                          // получаем номер телефона для имени
          if (recordPhone.equalsIgnoreCase(phone)) { // если значение совпадает с искомым
                                                     // если номер телефона тот, который мы ищем
            System.out.println("Имя владельца: " + recordName);
//            break;
          }
        }
      } else {
        System.out.println("В телефонной книге нет такого номера: " + phone);
      }

      // вывести всю телефонную книгу
      // пара "ключ-значение" имеет тип Map.Entry<ТипКлюча, ТипЗначения>
      // Map.Entry<ТипКлюча, ТипЗначения> - пара словаря с ТипомКлюча и ТипомЗначения
      // словарь.entrySet() - множество пар "ключ-значение"
      // Множество<Пара<ТипКлюча, ТипЗначения>>
      // for (ТипЭлемента элемент : наборЭлементов)
      // for (ТипПары пара : словарь.множествоПар)
      for (Map.Entry<String, String> record : phoneBook.entrySet()) {
        // пара.getKey() - ключ в паре
        // пара.getValue() - значение в паре
        // пара.setValue(новоеЗначение) - изменить значение в паре
        // System.out.println("Имя: номерТелефона");
        String recordName = record.getKey();
        String recordPhone = record.getValue();
        System.out.println(recordName + ": " + recordPhone);
      }
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат числа: " + e.getMessage());
    }
  }
}
