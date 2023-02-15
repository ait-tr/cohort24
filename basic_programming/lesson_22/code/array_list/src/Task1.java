import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество имён: ");
    int n = Integer.parseInt(br.readLine());

    String[] names = new String[n];
    System.out.println("Введите " + n + " имён:");
    for (int i = 0; i < n; ++i) {
      System.out.print((i + 1) + ". "); // 0 -> 1,
      names[i] = br.readLine();
    }

    System.out.print("Введите номер имени для вывода: ");
    int numToPrint = Integer.parseInt(br.readLine());
    int iToPrint = numToPrint - 1;

    System.out.println(numToPrint + ". " + names[iToPrint]);

    System.out.print("Хотите добавить имя? [y/n]: ");
    String answer = br.readLine();
    if (answer.equalsIgnoreCase("y")) {
      // Добавляем имя в массив
      String[] newNames = new String[names.length + 1];
      for (int i = 0; i < names.length; ++i) {
        newNames[i] = names[i];
      }
      names = newNames;
      System.out.print(names.length + ". "); // 0 -> 1,
      names[names.length - 1] = br.readLine();
    }
  }
}
