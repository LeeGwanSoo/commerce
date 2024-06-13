package com.commerce.test.mapper;

import com.commerce.test.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDto> getTestList();

    TestDto getTest(String testId);

    void saveTest(TestDto testDto);
}
