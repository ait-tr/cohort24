import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3ArrayStrings {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество строчек: ");
    int n = Integer.parseInt(br.readLine());

    List<String> lines = new ArrayList<>();
    System.out.println("Введите " + n + " строчек:");
    for (int i = 0; i < n; ++i) {
//      String line = br.readLine();
//      lines.add(line);
      lines.add(br.readLine());
    }

    // Вывести эти строчки в обычном порядке
    for (int i = 0; i < lines.size(); ++i) {
      System.out.println(lines.get(i));
    }

    // Вывести эти строчки в обратном порядке
    for (int i = lines.size() - 1; i >= 0; --i) {
      System.out.println(lines.get(i));
    }
  }
}
