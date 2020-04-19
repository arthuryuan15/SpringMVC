package com.yuan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取前端参数
        String method = req.getParameter("method"); // url映射到java类或java类的方法
        if(method.equals("add")){
            req.getSession().setAttribute("msg","执行了add方法"); // 封装用户提交的数据 .
        }
        if(method.equals("delete")){
            req.getSession().setAttribute("msg","执行了delete方法"); // 封装用户提交的数据 .
        }
        // 2. 调用业务层

        // 3. 视图层转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp); // 将响应的数据进行渲染 . jsp / html 等表示层数据

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); // 用doPost去调doGet
    }
}
