import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3PhoneBook {

  final public static String NAME = "name";
  final public static String PHONE = "phone";
  final public static String E_MAIL = "e-mail";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество записей: ");
    int n = Integer.parseInt(br.readLine());

    // List<ТипЭлемента>
    // ТипЭлемента = Map<String, String>
    // List<Map<String, String>>

    List<Map<String, String>> records = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      Map<String, String> record = readRecord();
      records.add(record);
    }

//    System.out.println(records);
    for (Map<String, String> record : records) {
      printRecord(record);
    }
  }

  public static void printRecord(Map<String, String> record) {
    System.out.println("Имя:      " + record.get(NAME));
    System.out.println("Телефон:  " + record.get(PHONE));
    System.out.println("E-Mail:   " + record.get(E_MAIL));
  }

  public static Map<String, String> readRecord() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите имя:");
    String name = br.readLine();
    System.out.println("Введите номер телефона:");
    String phone = br.readLine();
    System.out.println("Введите электронную почту:");
    String eMail = br.readLine();

    return buildRecord(name, phone, eMail);
  }

  public static Map<String, String> buildRecord(String name, String phone, String eMail) {
    Map<String, String> record = new HashMap<>();
    record.put(NAME, name);
    record.put(PHONE, phone);
    record.put(E_MAIL, eMail);
    return record;
  }
}
