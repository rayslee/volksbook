package com.simwor.volksbook.service.impl;

import com.simwor.volksbook.service.BaseService;

public class BaseServiceImpl implements BaseService {

    @Override
    public String hello() {
        return "Hello, this is volks-book application";
    }

}
