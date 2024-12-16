package com.commerce.main.controller;

import com.commerce.jwt.JWTUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AdminController {

    @Autowired
    JWTUtil jwtUtil;

    @GetMapping("/admin")
    public String adminP(HttpServletRequest request) {

        String name = jwtUtil.getUsername(request.getHeader("access"));
        return name + "Admin Controller";
    }
}
