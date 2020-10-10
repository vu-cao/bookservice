package net.microservices.bookstore.bookservice.service.impl;

import net.microservices.bookstore.bookservice.model.Author;
import net.microservices.bookstore.bookservice.model.Book;
import net.microservices.bookstore.bookservice.repository.BookRepository;
import net.microservices.bookstore.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Set<Book> findByAuthorId(String authorId) {
        return bookRepository.findByAuthorId(authorId);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}
