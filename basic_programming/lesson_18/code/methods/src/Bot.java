import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Bot {

  public static String readName() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введи имя:");
    String name = br.readLine();
    while (name.isEmpty()) {
      System.out.println("Имя не может быть пустым. Введи имя:");
      name = br.readLine();
    }
    return name;
  }

  public static int readAge() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введи возраст:");
    int age = Integer.parseInt(br.readLine());
    while (age < 0) {
      System.out.println("Введи правильный возраст:");
      age = Integer.parseInt(br.readLine());
    }
    return age;
  }

  public static boolean yesOrNo() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String response = br.readLine().toLowerCase();
    while (!(response.equals("да") || response.equals("нет"))) {
      System.out.println("Введи 'да' или 'нет':");
      response = br.readLine().toLowerCase();
    }

    // сюда попадёт только "да" или "нет"
    return response.equals("да");
  }

  public static int readChildren() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Есть ли у тебя дети?");
    if (yesOrNo()) {
      System.out.println("Введи количество:");
      return Integer.parseInt(br.readLine());
    }
    return 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("=== Бот 0.0.5 ===");

    String name = readName();
    System.out.println("Привет, " + name);

    int age = readAge();

    int children = 0;
    if (age > 18) {
      children = readChildren();
    }
  }
}
