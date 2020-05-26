//package com.example.demo.filter;
//
//import com.example.demo.configure.BodyReaderHttpServletRequestWrapper;
//import com.example.demo.util.SignUtil;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
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
//public class RequserAgainFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        // 防止流读取一次后就没有了, 所以需要将流继续写出去
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        ServletRequest requestWrapper = new BodyReaderHttpServletRequestWrapper(httpServletRequest);
//
//
//        String body = ((BodyReaderHttpServletRequestWrapper) requestWrapper).getBodyString(request);
//        System.out.println(body);
//
//
//
//        //拿到?后对应参数键值对
//        Map<String,String[]> map =request.getParameterMap();
//        Map<String,String> map2 =new HashMap<>();
//        for(Iterator iter = map.entrySet().iterator(); iter.hasNext();){
//            Map.Entry element = (Map.Entry)iter.next();
//            Object strKey = element.getKey();
//            Object strObj = element.getValue();
//            System.out.println(((String[])strObj)[0]);
//            map2.put((String) strKey,((String[])strObj)[0]);
//        }
//        map2.put("body",body);
//        try{
//            String timeStamp=request.getHeader("timeStamp");
//            if(timeStamp!=null){
//                Long s = (System.currentTimeMillis() - Long.parseLong(timeStamp)) / (1000 * 60);
////                if(s>5||s<-5){
////                    throw new IllegalStateException("timeStamp超出有效期");
////                }
//
//                //把时间戳加上一起算
//                map2.put("timeStamp",timeStamp);
//            }
//        }catch (NullPointerException e){
//            throw new IllegalStateException("timeStamp不存在");
//        }catch (NumberFormatException e){
//            throw new IllegalStateException("timeStamp格式错误");
//        }
//
//
//
//        SignUtil.getSignAndUrl(map2);
//
//        System.out.println("过滤器实现");
//
//        //最终的塞的操作
//        filterChain.doFilter(requestWrapper, response);
//    }
//
//}
