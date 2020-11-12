package com.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : WXC
 * date    : 2020/11/12 8:50
 * desc    :-
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test1() {
        return "hello world";
    }
}
