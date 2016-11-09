package com.hanc.test;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2016/11/2.
 * function：异步的处理测试接口
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Future<HttpResponse<JsonNode>> future = Unirest.post("http://newmobile.vstate.cn/mobile")
                .header("accept", "application/json")
                .body("{\"service\":\"index\", \"version\":\"1.0\", \"os\":\"ios\", \"order_no\":\"123123\"}")
                .asJsonAsync(new Callback<JsonNode>() {

                    public void failed(UnirestException e) {
                        System.out.println("The request has failed");
                    }

                    public void completed(HttpResponse<JsonNode> response){
                        int code = response.getStatus();
                        Map<String, List<String>> headers = response.getHeaders();
                        JsonNode body = response.getBody();
                        InputStream rawBody = response.getRawBody();
                        String myBody = response.getBody().toString();
                        System.out.println(myBody.hashCode());

                        if(myBody.hashCode() != 123){
                            System.out.println(myBody);
                        }

                    }

                    public void cancelled() {
                        System.out.println("The request has been cancelled");
                    }

                });
    }
}
