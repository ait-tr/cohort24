package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Game {

  private Hero mainHero; // mainHero - главный персонаж игры
  private List<Room> rooms;
  private Room current;

  public Game() {
    rooms.add(new Room("Зал"));
    rooms.add(new Room("Кухня"));
    rooms.add(new Room("Туалет"));
    rooms.add(new Room("Коридор"));
  }

  public void start(BufferedReader br) throws IOException {
    System.out.println("=== Текстовый квест v 0.1.0 ===");

    System.out.print("Введите имя: ");
    String name = br.readLine();
    mainHero = new Hero(name);
    mainCycle(); // запускаем основной игровой цикл
  }

  public void mainCycle() {
    // основной игровой цикл
  }
}
