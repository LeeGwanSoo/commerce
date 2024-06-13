package com.commerce.test.controller;

import com.commerce.test.dto.TestDto;
import com.commerce.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping(value = "/test")
    public void createTest(TestDto testDto){
        testService.saveTest(testDto);
    }

    @GetMapping(value = "/test/{testId}")
    public TestDto getPrdId(@PathVariable String testId){
        TestDto testDto = testService.getTest(testId);
        return testDto;
    }

    @GetMapping(value = "/test/list")
    public List<TestDto> getTestList(){
        List<TestDto> testList = testService.getTestList();
        return testList;
    }

}
