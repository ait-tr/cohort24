import homework_46.Book;

import java.util.Comparator;

public class BookAuthorPagesComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    if (!o1.getAuthor().equals(o2.getAuthor())) {
      return o1.getAuthor().compareTo(o2.getAuthor());
    }
//    return o1.getPages() - o2.getPages(); // сортировка по возрастанию страниц
    return -(o1.getPages() - o2.getPages()); // сортировка по убыванию страниц
  }
}
