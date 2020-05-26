//package com.example.demo.filter;
//
//import com.example.demo.configure.BodyReaderHttpServletRequestWrapper;
//import com.example.demo.controller.HttpHelper;
//import com.example.demo.util.SignUtil;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//
//@Component
//@WebFilter(urlPatterns = "/*",filterName = "blosTest")
//@Order(1)
//public class SimpleFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request= (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        ServletRequest requestWrapper = new BodyReaderHttpServletRequestWrapper(request);
//        String body = HttpHelper.getBodyString(requestWrapper);
//
//        System.out.println(body);
//
//        //签名字符串
//        String klnSign=null;
//        //拿到?后对应参数键值对
//        Map<String,String[]> map =request.getParameterMap();
//        Map<String,String> map2 =new HashMap<>();
//        for(Iterator iter = map.entrySet().iterator(); iter.hasNext();){
//            Map.Entry element = (Map.Entry)iter.next();
//            Object strKey = element.getKey();
//            Object strObj = element.getValue();
//            System.out.println(((String[])strObj)[0]);
//            if(((String)strKey).equals("klnSign")){
//                klnSign=((String[])strObj)[0];
//                continue;
//            }
//            map2.put((String) strKey,((String[])strObj)[0]);
//        }
//        map2.put("body",body);
//        try{
//            String timeStamp=request.getParameter("klnTimeStamp");
//
//                Long s = (System.currentTimeMillis() - Long.parseLong(timeStamp)) / (1000 * 60);
////                if(s>5||s<-5){
////                    throw new IllegalStateException("timeStamp超出有效期");
////                }
//
//                //把时间戳加上一起算
//                map2.put("klnTimeStamp",timeStamp);
//
//        }catch (NullPointerException e){
//            throw new IllegalStateException("klnTimeStamp不存在");
//        }catch (NumberFormatException e){
//            throw new IllegalStateException("klnTimeStamp格式错误");
//        }
//
//
//
//        if(!SignUtil.getSignAndUrl(map2).equals(klnSign)){
//            throw new IllegalStateException("签名错误");
//        }
//
//        System.out.println("过滤器实现");
//        filterChain.doFilter(requestWrapper,response);
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
//
