package homework_45;

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
}
