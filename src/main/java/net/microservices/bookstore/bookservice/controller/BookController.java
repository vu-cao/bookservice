package net.microservices.bookstore.bookservice.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.microservices.bookstore.bookservice.model.Book;
import net.microservices.bookstore.bookservice.service.BookService;


@RestController
@RequestMapping("/v1/books")
public class BookController
{
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/isbn/{isbn}", method = RequestMethod.GET)
	public Book getBookByIsbn(@PathVariable final String isbn)
	{
		return bookService.findByIsbn(isbn);
	}

	@RequestMapping(value = "/author/{authorId}", method = RequestMethod.GET)
	public Set<Book> getBooksByAuthorId(@PathVariable final String authorId)
	{
		return bookService.findByAuthorId(authorId);
	}
}
