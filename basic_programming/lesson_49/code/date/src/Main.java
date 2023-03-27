import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    // женский род, потому что слово "программа" женского рода
    System.out.println("Рада познакомиться, " + name + "! А какого ты года рождения?");
    int year = Integer.parseInt(br.readLine());
//    if (year > CURRENT_YEAR) {
//      System.out.println("Извините, дата рождения не может быть в будущем!");
//    }

    Date current = new Date(); // текущая дата и время
    // Date - количество миллисекунд с момента 00:00:00 UTC 01.01.1970
    // например, 1679939243000 миллисекунд - это 2023-03-27 17:47:23.000

    // getYear() вернёт год. Но:
    // - он deprecated (устаревший) и больше не поддерживается
    // - он возвращает количество лет, прошедшее с 1900 года
    int age = 1900 + current.getYear() - year;
    System.out.println("Похоже, тебе " + age + " лет. Или " + (age - 1) + "!");
  }
}
