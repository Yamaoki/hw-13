import java.util.Objects;

public class Book {
    private final String book;
    private final Author author;
    private int year;

    public Book(String book, Author author, int year) {
        this.book = book;
        this.author = author;
        this.year = year;
    }
    public String getBook() {
        return this.book;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return this.book + "! написана автором - " + this.author + " и опубликованна в - " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return year == book1.year && Objects.equals(book, book1.book) && Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author, year);
    }
}
