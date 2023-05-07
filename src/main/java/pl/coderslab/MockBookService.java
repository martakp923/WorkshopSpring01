package pl.coderslab;

import java.util.List;

public class MockBookService implements BookService {


    @Override
    public List<Book> getBooks() {
        return null;
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public Book getBook(Long id) {
        return null;
    }
}
