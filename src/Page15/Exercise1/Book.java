package Page15.Exercise1;

public class Book {
    Author author;
    String title, isbnCode;


    public Book(Author author, String title, String isbnCode) {
        this.author = author;
        this.title = title;
        this.isbnCode = isbnCode;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", isbnCode='" + isbnCode + '\'' +
                '}';
    }
}
