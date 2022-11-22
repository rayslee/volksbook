package com.simwor.volksbook.bean;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class Book {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String isbn;

    private String authorName;

    private String authorId;

    private LocalDateTime publishDate;

}
