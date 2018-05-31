package com.lzm.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 爱不留   
* @date 2018年5月29日 下午5:21:19 
**/
@SpringBootApplication
@RestController
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
