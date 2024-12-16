package com.commerce.main.service.impl;

import com.commerce.main.mapper.MainMapper;
import com.commerce.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    MainMapper mainMapper;

    @Override
    public String getTest() {
        String res = mainMapper.getTest();
        return res;
    }
}
