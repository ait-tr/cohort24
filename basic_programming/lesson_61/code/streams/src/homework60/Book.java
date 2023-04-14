package homework60;

public class Book {

  private final String author;
  private final String title;
  private final int pages;

  // в конструктор которого передавайте автора, название книги и
  // количество страниц.
  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  // сеттеров не будет - все поля final (константы)

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
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }
}