package com.example.pub.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {

    public static final String TAG = "MyFilter1 : ";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("CORS 필터 작동");
        HttpServletResponse resp = (HttpServletResponse) response;
//        resp.setHeader("Access-Control-Allow-Origin", "http://www.kimhk1030.ml:8081");
        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");

        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE");
//        resp.setHeader("Access-Control-Allow-Headers", "*");
        resp.setHeader("Access-Control-Allow-Credentials","true");
        // 해당 헤더가 없으면 아래 7가지의 header값만 응답할 수 있다.
        // Cache-Control
        //Content-Language
        //Content-Length
        //Content-Type
        //Expires
        //Last-Modified
        //Pragma
//        resp.setHeader("Access-Control-Expose-Headers", "*");

        chain.doFilter(request, resp);
    }

}