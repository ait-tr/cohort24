import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStrings {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] lines = new String[5]; // массив из 5 строк (String)
    // при создании там null (пустые ссылки)

    lines = new String[10]; // все старые ссылки из lines просто потерялись
    // теперь здесь 10 пустых ссылок (null)

    // массив.length - размер массива, если мы его не знаем или не помним,
    // или не хотим писать "магическую константу"
    for (int i = 0; i < lines.length; ++i) {
      lines[i] = br.readLine();
    }
//    String lines0 = br.readLine();
//    String lines1 = br.readLine();
//    String lines2 = br.readLine();
//    String lines3 = br.readLine();
//    String lines4 = br.readLine();
//    String lines5 = br.readLine();
//    String lines6 = br.readLine();
//    String lines7 = br.readLine();
//    String lines8 = br.readLine();
//    String lines9 = br.readLine();

    // (массив.length - 1) - последний индекс массива
    for (int i = lines.length - 1; i >= 0; --i) {
      System.out.println(lines[i]);
    }
//    System.out.println(lines9);
//    System.out.println(lines8);
//    System.out.println(lines7);
//    System.out.println(lines6);
//    System.out.println(lines5);
//    System.out.println(lines4);
//    System.out.println(lines3);
//    System.out.println(lines2);
//    System.out.println(lines1);
//    System.out.println(lines0);
  }
}
