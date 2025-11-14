package com.herokuapp.google_book_search_supreme_backend.service;

import com.herokuapp.google_book_search_supreme_backend.entity.Book;
import com.herokuapp.google_book_search_supreme_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Book> getAllSavedBooks() {
        return repository.findAll();
    }
}
