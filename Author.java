import java.lang.reflect.Array;
import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private String gender;
    private ArrayList<Book> books;

    public Author(String name, String email, String gender, ArrayList books) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.books = books;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", books=" + books +
                '}';
    }

    public void addBook(Book book) {
        books.add(book);

    }
}
