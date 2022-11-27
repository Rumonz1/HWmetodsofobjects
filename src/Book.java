import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName ;
    private int publicationYear;

    public Book(String bookName, Author name, int publicationYear) {
        this.bookName = bookName;
        this.authorName = name;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Автор книги: "+getName()+". Название книги: "+getBookName()+". Опубликована в: "+getPublicationYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
