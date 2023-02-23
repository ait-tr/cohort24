import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Example1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Map<String, String> commands = new HashMap<>();
    commands.put("вверх", "Вы попытались подпрыгнуть и ударились головой");
    commands.put("вперёд", "Вы шагаете, открываете дверь и...");
    commands.put("вправо", "Вы попытались повернуть направо, но проём тут же завалило");
    commands.put("влево", "Вы шагнули влево и чуть не сорвались в пропасть");

    System.out.println("Введите команду:");
    for (String command : commands.keySet()) {
      System.out.println("- " + command);
    }
    String command = br.readLine().toLowerCase();

    if (commands.containsKey(command)) {
      System.out.println(commands.get(command));
    } else {
      System.out.println("Нет такой команды");
    }
  }
}
