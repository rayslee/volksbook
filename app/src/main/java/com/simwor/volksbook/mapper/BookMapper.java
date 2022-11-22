package com.simwor.volksbook.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simwor.volksbook.bean.Book;
import org.apache.ibatis.annotations.Select;

public interface BookMapper extends BaseMapper<Book> {

    @Select("SELECT * FROM book where isbn = #{isbn}")
    Book queryByIsbn(String isbn);

}
