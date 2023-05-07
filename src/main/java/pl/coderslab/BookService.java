
package pl.coderslab;
import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getBooks();
    Optional<Book> get(long id);

    void addBook(Book book);
    void deleteBook(Long id);
    void updateBook(Book book);
}