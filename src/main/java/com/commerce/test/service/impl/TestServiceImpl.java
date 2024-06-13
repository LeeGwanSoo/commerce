package com.commerce.test.service.impl;

import com.commerce.test.dto.TestDto;
import com.commerce.test.mapper.TestMapper;
import com.commerce.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public TestDto getTest(String testId) {
        TestDto testDto = testMapper.getTest(testId);
        return testDto;
    }

    @Override
    public void saveTest(TestDto testDto) {
        testMapper.saveTest(testDto);
    }

    @Override
    public List<TestDto> getTestList() {
        List<TestDto> testDtoList = testMapper.getTestList();
        return testDtoList;
    }

}
