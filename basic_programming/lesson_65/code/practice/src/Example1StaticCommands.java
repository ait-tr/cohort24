import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Example1StaticCommands {

  private static final Map<String, String> commands = new HashMap<>();

  static {
    commands.put("hi", "Привет!");
    commands.put("bye", "Пока!");
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Hello world!");

    System.out.println("Введите команду:");
    String result = getCommandResult(bufferedReader);
    System.out.println(result);
  }

  public static String getCommandResult(BufferedReader bufferedReader) throws IOException {
    String command = bufferedReader.readLine().toLowerCase();
    if (commands.containsKey(command)) {
      return commands.get(command);
    }
    return "Нет такой команды!";
  }
}
