package com.commerce.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MypageController {

    @GetMapping("/mypage")
    @ResponseBody
    public String myApi() {
        return "my route";
    }
}
