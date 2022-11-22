package com.simwor.volksbook.service;

import com.simwor.volksbook.bean.Book;

public interface BookService {

    Book findByIsbn(String isbn);

}
