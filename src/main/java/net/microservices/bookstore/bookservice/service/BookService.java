package net.microservices.bookstore.bookservice.service;

import java.util.Set;

import net.microservices.bookstore.bookservice.model.Author;
import net.microservices.bookstore.bookservice.model.Book;

public interface BookService {
    Set<Book> findByAuthorId(final String authorId);
    Book findByIsbn(final String isbn);
    void saveBook(final Book book);
}
