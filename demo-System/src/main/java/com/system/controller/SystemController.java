package com.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {
    @GetMapping("/")
    public String system(){
        return "System系统模块";
    }
    @GetMapping("/getSystem")
    public String getSystem(){
        return "System系统信息";
    }
}
