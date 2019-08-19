package com.wuhan.wht.basic.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/8/19-16:10
 * @description
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
