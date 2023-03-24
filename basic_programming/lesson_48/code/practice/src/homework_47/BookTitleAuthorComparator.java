package homework_47;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    if (!o1.getTitle().equals(o2.getTitle())) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
