package com.example.springboothw5.service;

import com.example.springboothw5.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    List<Book> getBySearch(String keyword);

}
