public class Book {
    private String nameBook;
    private String author;
    private int yearOfPublication;

    public Book(String nameBook, String author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;


    }
}
