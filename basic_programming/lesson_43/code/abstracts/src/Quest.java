import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import quest.Game;

public class Quest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Game mainQuest = new Game();
    mainQuest.start(br);
  }
}
