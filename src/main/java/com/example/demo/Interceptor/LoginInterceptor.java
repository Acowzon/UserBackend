package com.example.demo.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {
        Cookie[] cookies = request.getCookies();
        if (cookies==null||cookies.length==0){
            System.out.println("cookies==null||cookies.length==0");
            response.sendRedirect("/login");
            return  false;
        }
        String cookie_userName = null;
        String cookie_userValue = null;
        for(Cookie item :cookies){
            if ("cookie_userName".equals(item.getName())){
                System.out.println("interceptor cookie matched!\n");
                cookie_userValue = item.getValue();
                break;
            }
        }
        if(StringUtils.isEmpty(cookie_userValue)){
            response.sendRedirect("/login");
            System.out.println("isEmpty(cookie_userValue)");
            return false;
        }
        return true;
    }
}
