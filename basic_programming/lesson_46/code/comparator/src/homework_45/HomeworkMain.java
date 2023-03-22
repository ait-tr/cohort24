package homework_45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkMain {

  // Создайте класс `Book` (книга), в конструктор которого передавайте автора, название книги и
  // количество страниц.
  //
  // Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам, а если авторы
  // совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));

    Collections.sort(books);
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
