package net.microservices.bookstore.bookservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true, length = 20)
    private String isbn;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false)
    private Long authorId;
    private Date publishedDate;
    @Transient
    private String authorName;

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Book setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public Book setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public Book setAuthorId(Long authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Book setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
}
