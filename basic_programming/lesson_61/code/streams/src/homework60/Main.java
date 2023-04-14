package homework60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  // Используйте класс `Book` (книга) из домашнего задания к уроку 45.
  //
  // Создайте список книг и отсортируйте книги по названию,
  // (при одинаковых названиях - по автору) при помощи лямбда-функции.
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));

//    books.sort();
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
