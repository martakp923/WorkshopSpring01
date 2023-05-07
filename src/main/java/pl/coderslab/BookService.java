package pl.coderslab;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    void addBook(Book book);

    void deleteBook(Long id);

    void updateBook(Book book);

    Book getBook(Long id);

}