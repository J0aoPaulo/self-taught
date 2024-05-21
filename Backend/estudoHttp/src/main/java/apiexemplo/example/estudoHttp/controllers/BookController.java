package apiexemplo.example.estudoHttp.controllers;

import apiexemplo.example.estudoHttp.domain.Book;
import apiexemplo.example.estudoHttp.feign.BookClient;
import apiexemplo.example.estudoHttp.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookServices services;

    public BookController(BookServices service) {
        this.services = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = services.getBooksFromLibrary();
        return ResponseEntity.ok().body(books);
    }
}
