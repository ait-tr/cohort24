import java.io.*;

// Ctrl + Alt + L
// Command + Option + L

public class Homework10 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Hello, wie heist du?");
    String name = br.readLine();

    if (name.equals("Pedro")) {
      System.out.println("Ein schöne name Pedro,ich muss leider jetzt gehen");
      return; // досрочный выход из программы
    }

    System.out.println("Interesante Name, woher kommt der Name?");
    String land = br.readLine();
    if (land.equalsIgnoreCase("Armenien")) {
      System.out.println(land + "? Ich war schon in Armenien ist ein schones Land");
    } else {
      System.out.println("Ich muss leider gehen, schön tag noch");
    }
  }
}
