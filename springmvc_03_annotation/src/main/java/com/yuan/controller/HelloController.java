package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/HelloController")
public class HelloController {

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello")  // 如果用@RestController不会被视图层解析直接返回字符串
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVCAnnotation");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
//
//    @RequestMapping("/hello1") // 写了第二个请求
//    public String sayHello2(Model model){
//        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
//        model.addAttribute("msg","hello,SpringMVCAnnotation");
//        //web-inf/jsp/hello.jsp
//        return "hello";
//    }
//
//    @RequestMapping("/hello2") //  写了第三个请求
//    public String sayHello3(Model model){
//        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
//        model.addAttribute("msg","hello,SpringMVCAnnotation");
//        //web-inf/jsp/hello.jsp
//        return "hello";
//    }
}
