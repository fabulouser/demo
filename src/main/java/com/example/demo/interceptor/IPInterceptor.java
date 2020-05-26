//package com.example.demo.interceptor;
//
//
//import com.example.demo.configure.RequestWrapper;
//import com.example.demo.util.SignUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * CREATE BY funnyZpC ON 2018/5/3
// **/
//
//
//
//public class IPInterceptor implements HandlerInterceptor {
//
//
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
////        //拿到body的对应字符串
////        BufferedReader br = request.getReader();
////        String str, wholeStr = "";
////        while((str = br.readLine()) != null){
////            wholeStr += str;
////        }
//        RequestWrapper requestWrapper = new RequestWrapper((HttpServletRequest)request);
//
//
//        String body = requestWrapper.getBodyString();
//        System.out.println(body);
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
//
//        return true;
//    }
//
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}