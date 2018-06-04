package com.lzm.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* @author 爱不留   
* @date 2018年6月4日 下午5:03:18 
**/
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

	
	public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
	
}
