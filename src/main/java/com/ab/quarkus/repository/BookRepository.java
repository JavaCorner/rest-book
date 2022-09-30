package com.ab.quarkus.repository;

import com.ab.quarkus.model.Book;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
    String genre;

    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus","Arpit", 2020, genre),
                new Book(2, "Practise Quarkus","Arpit", 2020, genre),
                new Book(3, "Trying Quarkus","Arpit", 2020, genre),
                new Book(4, "Learning Quarkus","Arpit", 2020, genre)
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}