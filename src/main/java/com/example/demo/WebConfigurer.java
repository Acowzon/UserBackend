package com.example.demo;

import com.example.demo.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    /*
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration ir = registry.addInterceptor(this.loginInterceptor);
        ir.addPathPatterns("/*");
        // 不拦截路径
        ir.excludePathPatterns("/login","/doLogin","/register","/goRegister");
    }*/

}
