package apiexemplo.example.estudoHttp.feign;

import apiexemplo.example.estudoHttp.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "api-book", url = "https://api-book.s3.us-east-2.amazonaws.com")
public interface BookClient {

    @GetMapping("/books.json")
    List<Book> getBooks();
}
