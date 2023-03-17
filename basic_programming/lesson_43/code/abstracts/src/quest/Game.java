package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

  private Hero mainHero; // mainHero - главный персонаж игры
  private List<Room> rooms = new ArrayList<>();
  private Room current;
  private Map<String, Command> commands = new HashMap<>();

  public Game() {
    rooms.add(new Room("Зал"));
    rooms.add(new Room("Кухня"));
    rooms.add(new Room("Туалет"));
    rooms.add(new Room("Коридор"));

    commands.put("Вперёд", Command.FORWARD);
    commands.put("Назад", Command.BACK);
    commands.put("Влево", Command.LEFT);
    commands.put("Вправо", Command.RIGHT);
    commands.put("Выход", Command.EXIT);
  }

  public void start(BufferedReader br) throws IOException {
    System.out.println("=== Текстовый квест v 0.1.0 ===");

    System.out.print("Введите имя: ");
    String name = br.readLine();
    mainHero = new Hero(name);
    mainCycle(); // запускаем основной игровой цикл
  }

  public void mainCycle() {
    boolean playing = true;
    while (playing) {
      help();
      playing = false;
    }
  }

  public void help() {
    System.out.println("Возможные команды:");
    for (String command : commands.keySet()) {
      System.out.println("- " + command);
    }
  }
}
