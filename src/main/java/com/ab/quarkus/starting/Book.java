package com.ab.quarkus.starting;

public class Book {
    public int id;
    public String title;
    public String author;
    public int yearOfPublication;
    public String genre;

    public Book(int id, String title, String author, int yearOfPublication, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }
}
