package com.hanc.test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Test3 {
    public static void main(String[] args)  {
        //声明为单线程
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //规定每隔30分钟跑一次
        scheduledExecutorService.scheduleWithFixedDelay(new CheckoutInterfacneThread(),0,30, TimeUnit.MINUTES);

    }
}
