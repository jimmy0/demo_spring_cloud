package com.lzm.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @author 爱不留   
* @date 2018年5月29日 下午5:21:19 
**/
@SpringBootApplication
@EnableEurekaServer
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
