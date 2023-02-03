import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeCheck {
  final public static int MAX_STEPS = 10;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();
    while (name.isEmpty()) {
      System.out.println("Введите корректное имя!");
      name = br.readLine();
    }

    System.out.println("А сколько тебе лет?");
    int age = Integer.parseInt(br.readLine());
    int steps = 1; // счётчик
    while (age < 0 || age > 150) {
      System.out.println("А на самом деле?");
      age = Integer.parseInt(br.readLine());
      ++steps; // steps = steps + 1;
      if (steps >= MAX_STEPS) { // остановимся, если счётчик превысит значение
        break; // досрочный выход из цикла
      }
    }

    System.out.println(age < 18 ? "Хмм..." : "Приятно познакомиться, " + name + "!");

    System.out.println("А сколько ты зарабатываешь?");
    int salary = Integer.parseInt(br.readLine());
    steps = 1; // тот же самый счётчик, но заново - мы его сбрасываем
    while (salary < 0 || salary > 100000000) {
      if (salary < 0) {
        System.out.println("Ну ты ерунду какую-то пишешь. Так всё-таки?");
      } else {
        System.out.println("Не верю! А на самом деле?");
      }
      salary = Integer.parseInt(br.readLine());
      ++steps; // steps = steps + 1; // steps += 1; // steps++; // увеличить steps на один
      if (steps >= MAX_STEPS) { // закончим программу, если счётчик превысит значение
        System.out.println("Не хочешь - не надо!");
        return; // досрочно завершаем программу
      }
    }

    System.out.println("Всё, мне пора, пока!");
  }
}
