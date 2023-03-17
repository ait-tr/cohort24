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

    commands.put("вперёд", Command.FORWARD);
    commands.put("вперед", Command.FORWARD); // так можно, но тогда её два раза выведет help()
    commands.put("назад", Command.BACK);
    commands.put("влево", Command.LEFT);
    commands.put("вправо", Command.RIGHT);
    commands.put("выход", Command.EXIT);
    commands.put("справка", Command.HELP);
  }

  public void start(BufferedReader br) throws IOException {
    System.out.println("=== Текстовый квест v 0.1.0 ===");

    System.out.print("Введите имя: ");
    String name = br.readLine();
    mainHero = new Hero(name);
    mainCycle(br); // запускаем основной игровой цикл
  }

  private Command readCommand(BufferedReader br) throws IOException {
    System.out.print("Введите команду: ");
    String command = br.readLine().toLowerCase();
    while (!commands.containsKey(command)) {
      System.out.print("Введите корректную команду: ");
      command = br.readLine();
    }
    return commands.get(command);
  }

  private void mainCycle(BufferedReader br) throws IOException {
    boolean playing = true; // "продолжать ли игровой цикл"
    while (playing) {
      Command command = readCommand(br);
      switch (command) {
        case FORWARD -> {
          mainHero.move();
          System.out.println("Вы шагнули вперёд");
        }
        case BACK -> {
          mainHero.move();
          System.out.println("Вы шагнули назад");
        }
        case LEFT -> {
          mainHero.move();
          System.out.println("Вы шагнули влево");
        }
        case RIGHT -> {
          mainHero.move();
          System.out.println("Вы шагнули вправо");
        }
        case EXIT -> {
          System.out.println("До свидания!");
          System.out.printf("Герой по имени %s сделал %d шагов%n", mainHero.getName(),
              mainHero.getSteps());
          playing = false;
        }
        case HELP -> help();
      }
    }
  }

  public void help() { // вывод справки
    System.out.println("Возможные команды:");
    for (String command : commands.keySet()) {
      if (!command.contains("ё")) {
        System.out.println("- " + command);
      }
    }
  }
}
