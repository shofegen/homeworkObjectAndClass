import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfPublication);
    }
    public String toString() {
        return this.nameBook + " " + this.author + " " + this.yearOfPublication;
    }
}
