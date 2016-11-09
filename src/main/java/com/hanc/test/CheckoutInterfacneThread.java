package com.hanc.test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/11/9.
 */
public class CheckoutInterfacneThread implements Runnable{
    public static int j = 0;
    public static String messageBody = "";
    public void run() {
        for (int i = 0; i < Constant.Param.length; i++) {

            System.out.println("接口数量为："+Constant.Param.length+"  第"+(i+1)+"条数据");
            HttpResponse<JsonNode> jsonResponse = null;
            try {
                jsonResponse = Unirest.post("http://newmobile.vstate.cn/mobile")
                        .header("accept", "application/json")
                        .body(Constant.Param[i])
                        .asJson();

            } catch (UnirestException e) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos);
                e.printStackTrace(ps);
                messageBody = messageBody + "第" + (i+1) + "接口错误信息为：<br>"+ baos.toString()+"<br>";
                j++;
                continue;
            }
            JsonNode body = jsonResponse.getBody();
            Map<String, List<String>> headers = jsonResponse.getHeaders();

            int hashcode = body.toString().hashCode();
            //System.out.println("第" + (i + 1) + "条数据的hashcode为：" + hashcode);
            messageBody = messageBody + "第" + (i + 1) + "条数据的hashcode为：" + hashcode +"<br>";
            //System.out.println("第" + (i + 1) + "条数据的字符串为：" + body.toString());
            messageBody = messageBody + "第" + (i + 1) + "条数据的字符串为：" + body.toString()+"<br>"+"<br>";
            //System.out.println();
//            if(hashcode != Constant.hashList[j]){
//                System.out.println("数据的hashcode为："+body.hashCode());
//                System.out.println("实际的hashcode为："+Constant.hashList[j]);
//            }else {
//                System.out.println("测试通过");
//            }
            j++;
        }
        EmailsUtils e = new EmailsUtils();
        e.send("cuiliangliang@yunwii.com", "59条接口检测结果数据",messageBody,"");
    }
}
