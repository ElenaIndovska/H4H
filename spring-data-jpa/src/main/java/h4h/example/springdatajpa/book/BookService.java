package h4h.example.springdatajpa.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(long id) {return bookRepository.findById(id);}

    public Optional<Book> findByName(String name) {return bookRepository.findByName(name);}


    public Book addBook(Book book) { return  book;}
}
