import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example1Methods {

  public static void printHelp(Set<String> commands) {
    System.out.println("Возможные команды:");
    for (String command : commands) {
      System.out.println("- " + command);
    }
  }

  public static Map<String, String> buildCommands() {
    Map<String, String> commands = new HashMap<>();
    commands.put("вверх", "Вы попытались подпрыгнуть и ударились головой");
    commands.put("вперёд", "Вы шагаете, открываете дверь и...");
    commands.put("вправо", "Вы попытались повернуть направо, но проём тут же завалило");
    commands.put("влево", "Вы шагнули влево и чуть не сорвались в пропасть");

    return commands;
  }

  public static void main(String[] args) throws IOException {
    Map<String, String> commands = buildCommands();

    printHelp(commands.keySet());

    String command = readCommand(commands.keySet());

    System.out.println(commands.get(command));
  }

  public static String readCommand(Set<String> commands) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String command = "";
    while (!commands.contains(command)) {
      System.out.print("Введите команду: ");
      command = br.readLine().toLowerCase();
      if (!commands.contains(command)) {
        System.out.println("Нет такой команды!");
      }
    }
    return command;
  }
}
