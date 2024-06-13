package com.commerce.main.controller;

import com.commerce.common.ApiResponse;
import com.commerce.common.DefaultResponse;
import com.commerce.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping(value = "/main/test")
    public ApiResponse<String> getTest(){
        ApiResponse result = new ApiResponse(true,0,"정상처리되었습니다.",null);
        String res = mainService.getTest();

        result.setData(res);

        return result;
    }

}
