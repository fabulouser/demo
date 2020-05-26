package com.example.demo.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

//    @Bean  //把我们的拦截器注入为bean
//    public HandlerInterceptor getIPInterceptor(){
//        return new IPInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 多个拦截器组成一个拦截器链
//        // addPathPatterns 用于添加拦截规则, 这里假设拦截 /url 后面的全部链接
//        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(getIPInterceptor());
//        super.addInterceptors(registry);
//    }



}
