package com.simwor.volksbook.service.impl;

import com.simwor.volksbook.bean.Book;
import com.simwor.volksbook.mapper.BookMapper;
import com.simwor.volksbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book findByIsbn(String isbn) {
        return bookMapper.queryByIsbn(isbn);
    }

}
