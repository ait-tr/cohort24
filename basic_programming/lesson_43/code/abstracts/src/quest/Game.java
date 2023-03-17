package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Game {

  private Hero mainHero; // mainHero - главный персонаж игры
  private List<Room> rooms;
  private Room current;
  private List<String> commands;

  public Game() {
    rooms.add(new Room("Зал"));
    rooms.add(new Room("Кухня"));
    rooms.add(new Room("Туалет"));
    rooms.add(new Room("Коридор"));

    commands.add("Вперёд");
    commands.add("Назад");
    commands.add("Влево");
    commands.add("Вправо");
    commands.add("Выход");
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
    }
  }

  public void help() {
    System.out.println("Возможные команды:");
    for (int i = 0; i < commands.size(); ++i) {
      System.out.println((i + 1) + ". " + commands.get(i));
    }
  }
}
