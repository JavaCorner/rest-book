package com.ab.quarkus.starting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }*/

    @GET
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus","Arpit", 2020, "IT"),
                new Book(2, "Practise Quarkus","Arpit", 2020, "IT"),
                new Book(3, "Trying Quarkus","Arpit", 2020, "IT"),
                new Book(4, "Learning Quarkus","Arpit", 2020, "IT")
        );
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        return getAllBooks().size();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getBook(@PathParam("id") int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}