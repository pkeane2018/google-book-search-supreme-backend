package com.herokuapp.google_book_search_supreme_backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection="books")
public class Book {

    private String id;
    private String title;
    private String[] authors;
    private String description;
    private String image;
    private String link;
    private LocalDateTime date;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
