package com.example.springboothw5.dao;

import com.example.springboothw5.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();
    List<Book> search(String keyword);
}
