package com.example.springboothw5.service.impl;

import com.example.springboothw5.dao.BookDAO;
import com.example.springboothw5.model.Book;
import com.example.springboothw5.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {
    @Autowired
    private BookDAO bookDAO;
    @Override
    public List<Book>getAllBooks(){
        return bookDAO.findAll();
    }
    @Override
    public List<Book> getBySearch(String keyword){
        return bookDAO.search(keyword);
    }
}
