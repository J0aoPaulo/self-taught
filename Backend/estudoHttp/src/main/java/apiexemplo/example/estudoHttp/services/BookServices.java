package apiexemplo.example.estudoHttp.services;

import apiexemplo.example.estudoHttp.domain.Book;
import apiexemplo.example.estudoHttp.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    private final BookClient bookClient;

    public BookServices(BookClient client) {
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary() {
        return bookClient.getBooks();
    }
}