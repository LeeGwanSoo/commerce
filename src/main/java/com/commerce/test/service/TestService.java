package com.commerce.test.service;

import com.commerce.test.dto.TestDto;

import java.util.List;

public interface TestService {
    TestDto getTest(String testId);

    void saveTest(TestDto testDto);

    List<TestDto> getTestList();
}
