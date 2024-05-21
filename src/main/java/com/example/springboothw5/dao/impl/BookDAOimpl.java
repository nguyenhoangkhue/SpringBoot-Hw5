package com.example.springboothw5.dao.impl;

import com.example.springboothw5.dao.BookDAO;
import com.example.springboothw5.database.BookDB;
import com.example.springboothw5.model.Book;
import com.example.springboothw5.untils.file.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookDAOimpl implements BookDAO {

    @Autowired
    private IFileReader fileReader;
    @Override
    public List<Book> findAll(){
        return BookDB.books;
    }
    public List<Book> search(String keyword){
        return BookDB.books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
