package net.microservices.bookstore.bookservice.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.microservices.bookstore.bookservice.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Set<Book> findByAuthorId(final String authorId);

    public Book findByIsbn(final String isbn);
}
