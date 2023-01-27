import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bot {
  final public static int BASE_INCOME = 1000; // Пособие
  final public static int LEGAL_AGE = 18;
  final public static int INTEREST = 100_000; // в памяти будет 100000
  final public static int MINIMAL_INTEREST = INTEREST / 10;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Бот v.0.0.2");

    System.out.println("Привет! А как тебя зовут?");
    String name = br.readLine();
    System.out.printf("Я думаю, что %s - очень красивое имя!%n", name);

    int salary = BASE_INCOME;

    System.out.println("А сколько тебе лет?");
    int age = Integer.parseInt(br.readLine());
    if (age >= LEGAL_AGE) {
      System.out.println("Ого, такой взрослый!");

      System.out.println("А сколько ты зарабатываешь?");
      /*int*/ salary = Integer.parseInt(br.readLine()); // перезаписали значение вместо базового

      if (salary > INTEREST) {
        System.out.println("Ты такой интересный!");
      } else {
        System.out.println("Хм...");
      }
    } else {
      System.out.println("А мама тебе разрешает общаться с незнакомыми ботами?");
      System.out.println("Но " + salary + " для твоего возраста -- круто!");
    }

    if (salary > MINIMAL_INTEREST) {
      System.out.println("Я тоже хочу получать " + salary + "!");
    } else {
      System.out.println("А у меня зарплата больше!");
    }

    System.out.println("Извини, мне пора, пока!");
  }
}
