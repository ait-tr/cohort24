import homework60.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main7StreamInteractiveMapExample {

  public static void main(String[] args) {
    // создание
    List<String> titles = List.of("Букварь", "Вторая", "Синяя");
    titles.stream() // здесь поток строк (названий)
        .map(title -> {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Введите автора для книги " + title);
          String author = "Неизвестен";
          try {
            author = br.readLine();
          } catch (IOException e) {
            System.out.println("Автор " + author);
          }
          return new Book(author, title, 123);
        }) // а здесь уже поток книг
        .forEach(System.out::println);
    System.out.println("titles = " + titles);
  }
}
