package homework_46;

import java.util.ArrayList;
import java.util.List;

public class BooksRunner {

  // Используйте класс `Book` (книга) из предыдущего домашнего задания.
  //
  // Создайте компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору (и там, и там - по алфавиту)
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Синяя", "Неизвестен", 123));
    books.add(new Book("Букварь", "Народ", 25));
    books.add(new Book("Букварь", "Кто-то", 27));
    books.add(new Book("Вторая", "Кто-то", 254));

    books.sort(new BookTitleAuthorComparator());
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
