import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainAccounts {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // В нашей программе нужно прочитать два списка пользователей.
    List<Account> list1 = readAccountList(br);
    for (Account account : list1) {
      account.increaseReputation(10);
    }
    List<Account> list2 = readAccountList(br);
    for (Account account : list2) {
      account.decreaseReputation(10);
    }

    // Мы должны объединить эти два списка в множество
    Set<Account> accounts = new HashSet<>();
    // Первый список при этом в приоритете - именно из него мы берём баланс в случае разницы.
    accounts.addAll(list1); // добавить в множество accounts все элементы из списка list1
    // если элемент повторится (без учёта репутации, см. equals()), то он не будет добавлен
    accounts.addAll(list2); // добавить в множество accounts все элементы из списка list2

    // и вывести общее количество уникальных пользователей в этих двух списках
    System.out.println("Найдено всего " + accounts.size() + " уникальных записей:");
    for (Account account : accounts) {
      // а затем и самих людей
      System.out.println("- " + account); // account выводится через toString()
    }
  }

  // прочитать список учётных записей
  public static List<Account> readAccountList(BufferedReader br) throws IOException {
    System.out.print("Введите количество учётных записей в списке: ");
    int n = Integer.parseInt(br.readLine());
    List<Account> result = new ArrayList<>(n);
    for (int k = 1; k <= n; ++k) {
      System.out.println("Введите данные учётной записи №" + k + ":");
      result.add(readAccount(br));
    }
    return result;
  }

  // прочитать учётную запись
  public static Account readAccount(BufferedReader br) throws IOException {
    System.out.print("Введите имя: ");
    String name = br.readLine();
    System.out.print("Введите e-mail: ");
    String email = br.readLine();
    return new Account(name, email);
  }
}
