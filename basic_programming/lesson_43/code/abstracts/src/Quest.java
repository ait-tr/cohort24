import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import quest.Hero;
import quest.Room;

public class Quest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("=== Текстовый квест v 0.1.0 ===");

    System.out.print("Введите имя: ");
    String name = br.readLine();
    Hero mainHero = new Hero(name); // mainHero - главный персонаж игры

    Room mainRoom = new Room("Главный зал");
  }
}
