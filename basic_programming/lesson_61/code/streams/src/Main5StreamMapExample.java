import homework60.Book;
import java.util.List;

public class Main5StreamMapExample {

  public static void main(String[] args) {
    // создание
    List<String> titles = List.of("Букварь", "Вторая", "Синяя");
    titles.stream() // здесь поток строк (названий)
        .map(title -> new Book("Неизвестен", title, 123)) // а здесь уже поток книг
        .forEach(System.out::println);
    System.out.println("titles = " + titles);
  }
}
