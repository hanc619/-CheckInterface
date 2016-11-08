package com.hanc.test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Test3 {
    public static int j = 0;
    public static void main(String[] args)  {
        for (int i = 0; i < Constant.Param.length; i++) {
            HttpResponse<JsonNode> jsonResponse = null;
            try {
                jsonResponse = Unirest.post("http://newmobile.vstate.cn/mobile")
                        .header("accept", "application/json")
                        .body(Constant.Param[i])
                        .asJson();
            } catch (UnirestException e) {
                e.printStackTrace();
                j++;
                continue;
            }
            JsonNode body = jsonResponse.getBody();
            int code = jsonResponse.getStatus();
            Map<String, List<String>> headers = jsonResponse.getHeaders();

            int hashcode = body.toString().hashCode();
            System.out.println("第"+(i+1)+"条数据的hashcode为："+hashcode);
            System.out.println("第"+(i+1)+"条数据的字符串为："+body.toString());
            System.out.println();

//            if(hashcode != Constant.hashList[j]){
//                System.out.println("数据的hashcode为："+body.hashCode());
//                System.out.println("实际的hashcode为："+Constant.hashList[j]);
//            }else {
//                System.out.println("测试通过");
//            }
            j++;
        }
    }
}
