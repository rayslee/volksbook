package com.simwor.volksbook.controller;

import com.simwor.volksbook.bean.Book;
import com.simwor.volksbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/query-by-isbn")
    public Book queryByIsbn(@RequestParam("isbn") String isbn) {
        return bookService.findByIsbn(isbn);
    }

}
