package homework_46;

public class Book implements Comparable<Book> {

  private final String title;
  private final String author;
  private final int pages;

  public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  // "натуральная сортировка" - автор, потом название
  @Override
  public int compareTo(Book o) {
    if (!author.equals(o.author)) {
      return author.compareTo(o.author);
    }
    return title.compareTo(o.title);
  }

  // если определили compareTo, значит, определили и "что такое равенство"
  // значит, надо переопределить equals()
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book other)) {
      return false;
    }
    // дальше мы сравниваем Book this и Book other
    return /*this.*/compareTo(other) == 0; // если compareTo вернул 0, то книги равны
  }
}
