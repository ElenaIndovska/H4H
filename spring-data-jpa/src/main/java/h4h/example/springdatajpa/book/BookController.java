package h4h.example.springdatajpa.book;

import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public  @ResponseBody List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping(value = "/books/{id}")
    public  @ResponseBody
    Optional<Book> findById(@PathVariable long id) {
        return bookService.findById(id);
    }

    @GetMapping(value = "/books/names/{name}")
    public  @ResponseBody
    Optional<Book> findByName(@PathVariable String name) {
        return bookService.findByName(name);
    }

    @PostMapping(value = "/books")
    public  @ResponseBody
    Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

}
