import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    // женский род, потому что слово "программа" женского рода
    System.out.println("Рада познакомиться, " + name + "! А какого ты года рождения?");
    int year = Integer.parseInt(br.readLine());

    int age = 2023 - year;
    System.out.println("Похоже, тебе " + age + " лет. Или " + (age - 1) + "!");
  }
}
