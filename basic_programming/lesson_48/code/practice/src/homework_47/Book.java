package homework_47;

public class Book implements Comparable<Book> {

  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public int compareTo(Book other) {
    if (!author.equals(other.author)) {
      return author.compareTo(other.author);
    }
    return title.compareTo(other.title);
  }

  @Override
  public String toString() {
    return "Book{author='" + author + "', title='" + title + "', pages=" + pages + "}";
  }
}
