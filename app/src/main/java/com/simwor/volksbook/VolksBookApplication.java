package com.simwor.volksbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simwor.volksbook.mapper")
public class VolksBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(VolksBookApplication.class, args);
    }
}
