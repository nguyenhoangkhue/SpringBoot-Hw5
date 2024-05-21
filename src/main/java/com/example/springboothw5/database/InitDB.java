package com.example.springboothw5.database;

import com.example.springboothw5.untils.file.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB implements CommandLineRunner {
    @Autowired
    private IFileReader fileReader;
    @Override
    public void run(String... args) throws Exception{
        BookDB.books=fileReader.readFile("books.json");
    }
}
