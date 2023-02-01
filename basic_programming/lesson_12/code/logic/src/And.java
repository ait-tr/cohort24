import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Логическая операция И обозначается &&
// = и == -- разные операции
// & и && -- разные операции
// Если поставить &, Idea не покажет вам ошибку, но ошибка есть!!!
public class And {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Как вас зовут?");
    String name = br.readLine();

    System.out.println("А сколько вам лет?");
    int age = Integer.parseInt(br.readLine());

    if (name.equalsIgnoreCase("Кирилл") && (age == 30)) {
      System.out.println("У нас так много общего...");
    }

    System.out.println("А из какого ты города?");
    String city = br.readLine();
    if (name.equalsIgnoreCase("Кирилл") && (age == 30) && (city.equals("Белград"))) {
      System.out.println("Эй. Это не ты! Это я!");
    }
  }
}
