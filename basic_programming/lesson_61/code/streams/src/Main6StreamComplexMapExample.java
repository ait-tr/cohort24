import homework60.Book;
import java.util.List;

public class Main6StreamComplexMapExample {

  public static void main(String[] args) {
    // создание
    List<List<String>> titles = List.of(
        List.of("Неизвестен", "Букварь"), // List<String> info
        List.of("Некто", "Вторая"),       // List<String> info
        List.of("Известен", "Синяя")      // List<String> info
    );
    titles.stream() // здесь поток строк (названий)
        .map(info -> new Book(info.get(0), info.get(1), 123)) // а здесь уже поток книг
        .forEach(System.out::println);
    System.out.println("titles = " + titles);
  }
}
