package com.simwor.volksbook.mapper;

import com.simwor.volksbook.bean.Author;
import com.simwor.volksbook.bean.Book;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AuthorRepositoryTest {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private BookMapper bookMapper;

    @Test
    @Disabled
    public void testSaveAuthor() {
        Author author = new Author();
        author.setName("杨本芬");
        authorMapper.insert(author);
    }

    @Test
    @Disabled
    public void testSaveBook() {
        Book book = new Book();
        book.setName("秋园");
        book.setIsbn("1234567890");
        book.setAuthorName("杨本芬");
        book.setAuthorId("1594942336794103810");
        book.setPublishDate(LocalDateTime.now());
        bookMapper.insert(book);
    }

    @Test
    @Disabled
    public void testQueryByIsbn() {
        Book book = bookMapper.queryByIsbn("1234567890");
        System.out.println(book);
    }


}
