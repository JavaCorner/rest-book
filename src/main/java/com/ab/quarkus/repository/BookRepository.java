package com.ab.quarkus.repository;

import com.ab.quarkus.model.Book;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus","Arpit", 2020, "IT"),
                new Book(2, "Practise Quarkus","Arpit", 2020, "IT"),
                new Book(3, "Trying Quarkus","Arpit", 2020, "IT"),
                new Book(4, "Learning Quarkus","Arpit", 2020, "IT")
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}