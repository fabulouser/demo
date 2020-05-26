package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.AddOneNotifyForSchoolAdministratorVM;
import com.example.demo.entity.EnumDemo;
import com.example.demo.entity.Person;
import com.example.demo.webservice.DataCom;
import com.example.demo.webservice.DataComSoap;
import org.apache.xmlbeans.impl.schema.SoapEncSchemaTypeSystem;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.nio.ByteBuffer;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

@EnableAsync
@RestController()
@RequestMapping("/demo")
public class DemoController {



    @PostMapping("/notify")
    public void notifyMe(){
        System.out.println("回调");
    }

    @GetMapping("/nihao444")
    public String  nihao444(){
        System.out.println("回调");
        return "hello";
    }


    @GetMapping("/enumDemo")
    public void enumDemo() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        System.out.println(EnumDemo.man);
    }




    @PostMapping("/hey")
    public void hey(){

        System.out.println(UUIDUtil.longToString("123"));
    }


    @GetMapping("/hello")
    public String hello(){

        UUID u =UUID.nameUUIDFromBytes("string".getBytes());
        System.out.println(u.getLeastSignificantBits());
        System.out.println(u.getMostSignificantBits());
        System.out.println(u.node());
        System.out.println(u.toString());
        System.out.println(u.timestamp());

        //ByteBuffer buffer = ByteBuffer.wrap("ssw".getBytes());
        //System.out.println(buffer.getLong());

        return "hello";
    }

    @Async
    @GetMapping("/stringToAscii")
    public String stringToAscii(){

        String str="a";
        char ch=str.charAt(0);
        int i=(int)ch;
        System.out.println(i+"");

        return i+"";
    }

    @PostMapping("/forBody")
    public void forBody(@RequestParam("file") MultipartFile file){

        System.out.println("you are right");
    }

    @PostMapping(value = "/MoreBodyToLessObject" )
    public void MoreBodyToLessObject(@RequestBody Person person){

        System.out.println("person");
    }

    @PostMapping("/forAdd")
    public void forAdd(@RequestBody AddOneNotifyForSchoolAdministratorVM addOneNotifyForSchoolAdministratorVM,
                        @RequestParam("token") String token){

        System.out.println("you are right");
    }

    public Integer getUnExceptionBySchool(Long schoolNumber, Date startTime, Date endTime) throws Exception {


        SimpleDateFormat dateFormat=new SimpleDateFormat();
        dateFormat.applyPattern("yyyy-MM-dd");
        String endTimeStr=dateFormat.format(endTime);
        String startTimeStr=dateFormat.format(startTime);
        //endTime="2018-12-21";

        String loginUrl ="https://hdwx.bbicloud.com/Wx/app/index?https://hdwx.bbicloud.com/Wx/app/index?method=query_event&method={method}&meterNo={meterNo}&custNo={custNo}&startDay={startDay}";
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();
        uriVariables.put("method","query_graph");
        uriVariables.put("meterNo", "131709203214");
        uriVariables.put("custNo", "131709203215");
        uriVariables.put("startDay", endTimeStr);


        RestTemplate restTemplate =new RestTemplate();
        JSONObject startResultObject= restTemplate.getForObject(loginUrl,JSONObject.class,uriVariables);
        uriVariables.put("startDay", startTimeStr);
        JSONObject endResultObject= restTemplate.getForObject(loginUrl,JSONObject.class,uriVariables);

        Integer allUnException=0;
        if(startResultObject!=null&&null!=endResultObject){
            if(startResultObject.getString("code").equals("200")&&endResultObject.getString("code").equals("200")){
                JSONObject startDataObject= startResultObject.getJSONObject("data");
                JSONArray startRecordArray= startDataObject.getJSONArray("records");



                JSONObject endDataObject= endResultObject.getJSONObject("data");
                JSONArray endRecordArray= endDataObject.getJSONArray("records");

                allUnException=startRecordArray.size()+endRecordArray.size();
                System.out.println(startRecordArray.size()+endRecordArray.size());
                //
            }else{
                throw new IllegalStateException("开始:"+startResultObject.getString("result"+"结束:")+endResultObject.getString("result"));
            }
        }else{
            throw new IllegalStateException("访问智慧用电设备出错");
        }

        return allUnException;
    }


    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    break;
                }else{
                    int sum = nums[i]+nums[j];
                    if(sum==target){
                        int[] answer = {i,j};
                        return(answer);
                    }
                }
            }
        }

        return null;

    }


    public static void main(String[] args) throws ParseException {

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int weekType = cal.get(Calendar.DAY_OF_WEEK) - 1;

//        DataCom dataCom =new DataCom();
//        DataComSoap dataComSoap = dataCom.getDataComSoap();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        //开始时间
//        Date startDate = sdf.parse("2019-01-01");
//        //结束时间
//        Date endDate = sdf.parse("2019-06-23");
//        Calendar startCal = Calendar.getInstance();
//        Calendar endCal = Calendar.getInstance();
//        startCal.setTime(startDate);
//        endCal.setTime(endDate);
//        //结束时间转成下个月初
//        endCal.set(Calendar.DAY_OF_MONTH,endCal.getActualMinimum(Calendar.DAY_OF_MONTH));
//        endCal.add(Calendar.MONTH,1);
//        List<String> resultList = new ArrayList<>();
//        while(endCal.getTime().compareTo(endCal.getTime())!=1)
//        {
//            String startString=endCal.getTime().toLocaleString();
//            endCal.add(Calendar.MONTH,1);
//            String endString=endCal.getTime().toLocaleString();
//            String result = dataComSoap.getUserReadDuration("hzjyzx","123456","98",startString,endString);
//
//            resultList.add(result);
//
////            rightNow.setTime(dt);
////            rightNow.add(Calendar.MONTH, 1);
////            dt = rightNow.getTime();
////            String reStr = sdf.format(dt);
////            System.out.println(reStr);
////            rightNow.set(Calendar.DAY_OF_MONTH,rightNow.getActualMinimum(Calendar.DAY_OF_MONTH));
//        }




//        RestTemplate restTemplate =new RestTemplate();
//        Map<String ,Object> map =new LinkedHashMap<>();
//        map.put("clientId","2390b0aec4d84a0794cce18e5ce4e370");
//        map.put("clientSecret","6e8728ade306170a338a9517c7f5204a");
//        map.put("startDate",0L);
//        map.put("endDate",0L);
//        map.put("pageNo",1);
//        map.put("pageSize",1);
//        map.put("date",System.currentTimeMillis());
//        restTemplate.getForObject("https://api.sciener.cn/v3/user/list?clientId={clientId}&clientSecret={clientSecret}&startDate={startDate}&endDate={endDate}&pageNo={pageNo}&pageSize={pageSize}&date={date}", JSONObject.class,map);

//        RestTemplate restTemplate =new RestTemplate();
//        Map<String ,Object> map =new LinkedHashMap<>();
//        map.put("client_id","2390b0aec4d84a0794cce18e5ce4e370");
//        map.put("client_secret","6e8728ade306170a338a9517c7f5204a");
//        map.put("grant_type","password");
//        map.put("username","3375268572@qq.com");
//        map.put("password","b8ee2969955bec8a27645cc143777cd4");
//        map.put("redirect_uri","http://klnznkjcxx.vaiwan.com:8081/notify");
//        restTemplate.postForObject("https://api.sciener.cn/oauth2/token?client_id={client_id}&client_secret={client_secret}&grant_type={grant_type}&username={username}&password={password}&redirect_uri={redirect_uri}",null, JSONObject.class,map);

//        RestTemplate restTemplate =new RestTemplate();
//        Map<String ,Object> map =new LinkedHashMap<>();
//        map.put("clientId","2390b0aec4d84a0794cce18e5ce4e370");
//        map.put("accessToken","877c15851f0575f16568bdbd2615206e");
//        map.put("pageNo",1);
//        map.put("pageSize",10000);
//        map.put("date",System.currentTimeMillis());
//        restTemplate.postForObject("https://api.sciener.cn/v3/lock/list?clientId={clientId}&accessToken={accessToken}&pageNo={pageNo}&pageSize={pageSize}&date={date}",null, JSONObject.class,map);


//        RestTemplate restTemplate =new RestTemplate();
//        Map<String ,Object> map =new LinkedHashMap<>();
//        map.put("clientId","2390b0aec4d84a0794cce18e5ce4e370");
//        map.put("accessToken","877c15851f0575f16568bdbd2615206e");
//        map.put("lockId",1409507);
//        map.put("date",System.currentTimeMillis());
//        restTemplate.postForObject("https://api.sciener.cn/v3/lock/detail?clientId={clientId}&accessToken={accessToken}&lockId={lockId}&date={date}",null, JSONObject.class,map);



        DataCom dataCom =new DataCom();
        DataComSoap dataComSoap =dataCom.getDataComSoap();
        String str1 = dataComSoap.getUserReadDuration("hzjyzx","123456","98","1900-01-01","2019-05-03");
        System.out.println(str1);
        String str2= dataComSoap.getUserBorrowRecords("hzjyzx","123456","123",null,null);
        System.out.println(str2);
        String str3 = dataComSoap.getALLBorrowRecords("hzjyzx","123456","1900-01-01","2019-05-03");
        System.out.println(str3);

        int[] iii={2,7,11,5};
        twoSum(iii,9);

//        Integer[] array1={1,2,3};
//
//        Integer[] array2={2,2,6};
//
//        List<Integer> list1=new ArrayList<>(Arrays.asList(array1)) ;
//
//        List<Integer> list2=new ArrayList<>(Arrays.asList(array2)) ;
//
//
//        for(int i=0;i<list1.size();i++){
//            for(int j=0;j<list2.size();j++){
//                if(list1.get(i)==list2.get(j)){
//                    list1.get(i).;
//                }
//            }
//        }











//        Long qq=5L;
//
//
//        List<String> stringList=new ArrayList<>();
//        stringList.add("abc");
//        stringList.add("bcd");
//        if(stringList.contains("abc")){
//
//        }
//
//
//        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date=new Date(Long.parseLong("1552466119000"));
//        simpleDateFormat.format(date);
//
//        String str="a";
//        char ch=str.charAt(0);
//        int i=(int)ch;
//
//        char ch2=(char) Integer.parseInt("97");
//        System.out.println(i);
//        System.out.println(ch2);
//
//        System.out.println(System.currentTimeMillis());
//
//        SimpleDateFormat dateFormat=new SimpleDateFormat();
//        dateFormat.applyPattern("yyyy-MM-dd");
//        String endTime=dateFormat.format(new Date());
//        String startTime="2018-4-21";
//        endTime="2018-12-21";
//
//        String loginUrl ="https://hdwx.bbicloud.com/Wx/app/index?method={method}&meterNo={meterNo}&custNo={custNo}&startDay={startDay}";
//        Map<String, String> uriVariables = new LinkedHashMap<String, String>();
//        uriVariables.put("method","query_graph");
//        uriVariables.put("meterNo", "131709202250");
//        uriVariables.put("custNo", "131709202250");
//        uriVariables.put("startDay", startTime);
//
//
//        RestTemplate restTemplate = new RestTemplate();
//        JSONObject startResultObject= restTemplate.getForObject(loginUrl,JSONObject.class,uriVariables);
//        uriVariables.put("startDay", endTime);
//        JSONObject endResultObject= restTemplate.getForObject(loginUrl,JSONObject.class,uriVariables);
//
//        int startEnergy=0;
//        int endEnergy=0;
//        if(startResultObject!=null&&null!=endResultObject){
//            if(startResultObject.getString("code").equals("200")&&endResultObject.getString("code").equals("200")){
//                JSONObject startDataObject= startResultObject.getJSONObject("data");
//                JSONArray startRecordArray= startDataObject.getJSONArray("records");
//                startEnergy = startRecordArray.getJSONObject(startRecordArray.size()-1).getInteger("zxygz");
//
//
//                JSONObject endDataObject= endResultObject.getJSONObject("data");
//                JSONArray endRecordArray= endDataObject.getJSONArray("records");
//                endEnergy = endRecordArray.getJSONObject(0).getInteger("zxygz");
//
//                System.out.println(endEnergy-startEnergy);
//                //
//            }else{
//                throw new IllegalStateException("开始:"+startResultObject.getString("result"+"结束:")+endResultObject.getString("result"));
//            }
//        }else{
//            throw new IllegalStateException("访问智慧用电设备出错");
//        }

        String str = "str";
        str.matches("\\w");
        "_1_".matches("\\w{3}");
        "Aa11".matches("^[A-Z]{1}+[a-z]{1}+\\w+[0-9]{1}$");



    }

    private static String stringToLong(String string) {
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


    /**
     * 将字节数组转为long<br>
     * 如果input为null,或offset指定的剩余数组长度不足8字节则抛出异常
     * @param input
     * @param offset 起始偏移量
     * @param littleEndian 输入数组是否小端模式
     * @return
     */
    public static long longFrom8Bytes(byte[] input, int offset, boolean littleEndian){
        long value=0;
        // 循环读取每个字节通过移位运算完成long的8个字节拼装
        for(int  count=0;count<8;++count){
            int shift=(littleEndian?count:(7-count))<<3;
            value |=((long)0xff<< shift) & ((long)input[offset+count] << shift);
        }
        return value;
    }

    public static long bytes2Long(byte[] byteNum) {
        long num = 0;
        for (int ix = 0; ix < 8; ++ix) {
            num <<= 8;
            num |= (byteNum[ix] & 0xff);
        }
        return num;
    }



    @RequestMapping("/zhuan")
    public ModelAndView zhuan(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("type", "转发返回ModelAndView");
        //默认情况下使用转发
        //mv.setViewName("/result");

        //手动显式指定使用转发，此时springmvc.xml配置文件中的视图解析器将会失效
        mv.setViewName("forward:/hello");
        return mv;

    }



}
