package com.simwor.volksbook.bean;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Author {

    private Long id;

    @NotBlank
    private String name;

}
