package com.herokuapp.google_book_search_supreme_backend.repository;

import com.herokuapp.google_book_search_supreme_backend.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
