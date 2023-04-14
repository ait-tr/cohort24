import homework60.Book;
import java.util.List;

public class Main8StreamToListExample {

  public static void main(String[] args) {
    // создание
    List<String> titles = List.of("Букварь", "Вторая", "Синяя");
    List<Book> books = titles.stream() // здесь поток строк (названий)
        .map(title -> new Book("Неизвестен", title, 123)) // а здесь уже поток книг
        .toList();
    System.out.println("titles = " + titles);
    System.out.println("books = " + books);
  }
}
