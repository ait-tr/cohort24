package homework60;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Используйте класс `Book` (книга) из домашнего задания к уроку 45.
  //
  // Создайте список книг и отсортируйте книги по названию,
  // (при одинаковых названиях - по автору) при помощи лямбда-функции.
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 2", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));

    books.sort((o1, o2) -> {
      if (!o1.getTitle().equals(o2.getTitle())) {
        return o1.getTitle().compareTo(o2.getTitle());
      }
      return o1.getAuthor().compareTo(o2.getAuthor());
    });
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
