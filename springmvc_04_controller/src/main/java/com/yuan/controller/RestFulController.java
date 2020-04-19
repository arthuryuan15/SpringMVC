package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

     // 原来的：http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    // REstFul风格：http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b

//    @RequestMapping(name = "/add/{a}/{b}", method = RequestMethod.DELETE)
//    @RequestMapping(name = "/add/{a}/{b}", method = RequestMethod.GET)
    @PostMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){

        int res = a + b;
        model.addAttribute("msg", "结果1为" + res);
        return "test";
    }

    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){

        int res = a + b;
        model.addAttribute("msg", "结果2为" + res);
        return "test";
    }
}
