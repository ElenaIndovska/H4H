package h4h.example.springdatajpa.book;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository

public interface BookRepository extends JpaRepository<Book, Long> {

    //@Override
    //Optional<Book> findById(Long id);

    //Optional<Book> findByName(String name);

    @Query("SELECT b FROM Book b WHERE (b.name) = (:name)")
    public Optional<Book> findByName(@Param("name") String name);

    @Query("SELECT b FROM Book b WHERE (b.id) = (:id)")
    public Optional<Book> findById(@Param("id") Long id);

}