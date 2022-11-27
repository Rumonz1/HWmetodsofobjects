import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String authorName, String secondAuthorName) {
        this.firstName = authorName;
        this.secondName = secondAuthorName;
    }

    public String getAuthorName() {
        return firstName;
    }

    public String getSecondAuthorName() {
        return secondName;
    }

    public String toString() {
        return firstName + " "+ secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}
