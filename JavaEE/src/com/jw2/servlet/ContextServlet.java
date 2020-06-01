package com.jw2.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 * @date 2020-05-30 8:32
 * @title
 **/
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String name = context.getInitParameter("name");
        String age = context.getInitParameter("age");
        System.out.println(name + ":" + age);
        System.out.println("___----------------------_______");
        System.out.println("当前工程路径" + context.getContextPath());
        System.out.println("工程部署路径是" + context.getRealPath("/"));
    }
}
