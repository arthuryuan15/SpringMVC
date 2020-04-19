package com.yuan.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注意：这里我们先导入Controller接口
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        // 调用业务层，这里没有写

        //封装对象，放在ModelAndView中。Model
        mv.addObject("msg","HelloSpringMVC!"); // 可以直接取出来 /WEB-INF/jsp/hello.jsp 中的msg
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
        return mv;
    }
}
