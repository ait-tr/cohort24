import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> ukrainianNames = new HashSet<>();
    ukrainianNames.add("Пилип");
    ukrainianNames.add("Василь");
    ukrainianNames.add("Олена");
    ukrainianNames.add("Олексій");
    ukrainianNames.add("Олексiй");
    ukrainianNames.add("Андрій");
    ukrainianNames.add("Андрiй");
    ukrainianNames.add("Влад");

    Set<String> russianNames = new HashSet<>();
    russianNames.add("Филипп");
    russianNames.add("Василий");
    russianNames.add("Елена");
    russianNames.add("Алексей");
    russianNames.add("Андрей");
    russianNames.add("Влад");

    System.out.print("Введи имя: ");
    String name = br.readLine();
    if (ukrainianNames.contains(name) && russianNames.contains(name)) {
      System.out.println("Greetings!");
    } if (ukrainianNames.contains(name)) {
      System.out.println("Вітаю!");
    } else if (russianNames.contains(name)) {
      System.out.println("Приветствую!");
    } else {
      System.out.println("Hola!");
    }
  }
}
