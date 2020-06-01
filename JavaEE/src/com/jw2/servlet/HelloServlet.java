package com.jw2.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Administrator
 * @date 2020-05-29 16:20
 * @title
 **/
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("init 方法");
        System.out.println("HelloServlet 的别名是: " + servletConfig.getServletName());
        System.out.println("HelloServlet 的 username 参数的值是: " + servletConfig.getInitParameter("username"));
        System.out.println("HelloServlet 的 url 参数的值是: " + servletConfig.getInitParameter("url"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * service 方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet 被访问了");

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            System.out.println("get 请求");
        }else if("POST".equals(method)){
            System.out.println("post 请求");
        }



    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destory 方法");
    }
}
