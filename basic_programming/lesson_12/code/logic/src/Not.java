import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Логическая операция НЕ обозначается !
public class Not {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Скажи друг и войди!");
    String line = br.readLine();
    if (! line.equalsIgnoreCase("друг")) {
      System.out.println("... ворота остались закрытыми ...");
      return; // условие-стражник
    }

    System.out.println("Добро пожаловать в подземелья Мории, путник!");
  }
}
