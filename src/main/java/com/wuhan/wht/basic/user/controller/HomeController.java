package com.wuhan.wht.basic.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/8/19-16:13
 * @description
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello, Zbook!";
    }
}