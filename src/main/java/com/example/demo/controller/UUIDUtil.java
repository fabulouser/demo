package com.example.demo.controller;


public class UUIDUtil {
    //唯一字符串转换唯一Long,因为门禁系统的userid只能是数字类型，但是教师复合编号是一个字符串，教师复合编号是唯一的，所以所生成的数字也是唯一的，因为字符串相同，所以生成的数字是相同的

    public static String longToString(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); i = i + 3) {
            String substring = string.substring(i, i + 3);
            char ch = (char) Integer.parseInt(substring);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String uniqueStringTranslateUniqueLong(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); ++i) {
            int ch = (int) string.charAt(i);
            if (ch < 100) {
                if(ch<10)
                {
                    sb.append('0');
                }
                sb.append('0').append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public  static void main(String[] args){
//        System.out.println(UUIDUtil.uniqueStringTranslateUniqueLong("3100180001220171422"));
//        String str ="051050053050048048049048048050050084048048049";
//        String[] strArray=str.split("\n");
//        for(int i=0 ;i<strArray.length;i++){
//            try{
//                System.out.println(UUIDUtil.longToString(strArray[i]));
//            }catch (StringIndexOutOfBoundsException e){
//                System.out.println("错误数据"+strArray[i]);
//            }
//
//        }

//        UUIDUtil u= new UUIDUtil();
//        final Integer i =1;
//        Integer j = 2;
//        u.changei(i);
//        System.out.println(i);
//        u.changeI(j);
//        System.out.println(j);
//        u.changeI(i);
        Boolean b = true;
        if(b==false){
            System.out.println(1);
        }else {
            System.out.println(222);
        }

    }

    public void changei(int i){
        i=5;
    }

    public void changeI(Integer i){
        i=6;
    }

}

