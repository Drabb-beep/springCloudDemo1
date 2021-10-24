package com.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Test")
public class TestController {
    @GetMapping("getInfo")
    public String test01(){
        return "测试范围跟";
    }
}
