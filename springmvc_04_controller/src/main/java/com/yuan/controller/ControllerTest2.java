package com.yuan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 代表这个类会被spring接管
@RequestMapping("/ControllerTest2")
public class ControllerTest2{
    //映射访问路径
    @RequestMapping("/t2")
    public String index(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest2");
        //返回视图位置
        return "test"; //WEB-INF/jsp/hello.jsp
    }

    @RequestMapping("/t3")
    public String index1(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest2");
        //返回视图位置
        return "test"; //WEB-INF/jsp/hello.jsp
    }

}
