import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import quest.Game;
import quest.Hero;
import quest.Room;

public class Quest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Game mainQuest = new Game();
    mainQuest.start(br);
    // будет класс Game() - основной класс игры, который сможет:
    // - запускаться
    // - хранить в себе карту с комнатами
    // - хранить в себе персонажа
    // - уметь спрашивать команды в своём основном игровом цикле
    // - завершаться
  }
}
