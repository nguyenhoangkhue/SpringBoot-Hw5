package com.example.springboothw5.untils.file;

import com.example.springboothw5.model.Book;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class JsonFileReader implements IFileReader {
    @Override
    public List<Book> readFile(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Book> books = mapper.readValue(new File(filePath), new TypeReference<List<Book>>() {});
            return books;
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}