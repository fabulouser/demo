package com.example.demo.util;

import org.springframework.util.DigestUtils;

import java.util.*;

public class SignUtil {

    /**
     * 生成签名
     * @param map
     * @return
     */
    public static String getSignAndUrl(Map<String, String> map) {

        String url ="";
        //result是签名
        String result = "";
        try {
            List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(map.entrySet());
            // 对所有传入参数按照key的字段名的 ASCII 码从小到大排序（字典序）
            Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>() {

                public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                    return (o1.getKey()).toString().compareTo(o2.getKey());
                }
            });

            // 构造签名键值对的格式
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> item : infoIds) {
                if (item.getKey() != null || item.getKey() != "") {
                    String key = item.getKey();
                    String val = item.getValue();
                    if (!(val == "" || val == null)) {
                        sb.append(key + "=" + val + "&");
                    }
                }

            }

//			sb.append(PropertyManager.getProperty("SIGNKEY"));
            //拿到带参数的url
            url =sb.toString();


            result = sb.toString();

            //拼接AppKey
            result = result+"AppSercret="+map.get("token")+"klnznkj2019"+map.get("token");


            //进行MD5加密，生成sign
            result = DigestUtils.md5DigestAsHex(result.getBytes()).toUpperCase();
        } catch (Exception e) {
            return null;
        }
        //url =url+"sign="+result;

        return result;
    }

}
