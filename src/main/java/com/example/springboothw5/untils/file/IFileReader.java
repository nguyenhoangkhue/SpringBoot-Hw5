package com.example.springboothw5.untils.file;


import com.example.springboothw5.model.Book;

import java.util.List;

public interface IFileReader {
    List<Book> readFile(String filePath);
}