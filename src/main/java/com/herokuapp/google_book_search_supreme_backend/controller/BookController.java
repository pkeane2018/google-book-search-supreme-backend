package com.herokuapp.google_book_search_supreme_backend.controller;

import com.herokuapp.google_book_search_supreme_backend.entity.Book;
import com.herokuapp.google_book_search_supreme_backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Book> getAllSavedBooks() {
        System.out.println("Hoochy Mama!");
        List<Book> savedBooks = service.getAllSavedBooks();
        return savedBooks;
    }
}
