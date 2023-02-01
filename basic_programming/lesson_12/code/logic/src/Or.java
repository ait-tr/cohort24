import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Логическая операция ИЛИ обозначается ||
// = и == -- разные операции
// & и && -- разные операции
// | и || -- разные операции
// Если поставить |, Idea не покажет вам ошибку, но ошибка есть!!!
public class Or {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Какой твой любимый фильм?");
    String movie = br.readLine();

    System.out.println("А любимая книга?");
    String book = br.readLine();

    if (movie.equals("Star Trek") || (book.equals("Harry Potter"))) {
      System.out.println("А ведь у нас есть кое-что общее!");
    }
  }
}
