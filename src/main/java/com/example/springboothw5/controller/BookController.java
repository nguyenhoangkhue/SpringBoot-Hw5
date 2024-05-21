package com.example.springboothw5.controller;

import com.example.springboothw5.model.Book;
import com.example.springboothw5.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public String getAllProducts(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books",books);
        return "AllBooks";
    }
    @GetMapping("/books/search")
    public String getAllProducts(Model model,
                                 @RequestParam("keyword")String keyword) {
        List<Book> searchByKeyword=bookService.getBySearch(keyword);
        model.addAttribute("books",searchByKeyword);
        return "FindBySearch";
    }
}
