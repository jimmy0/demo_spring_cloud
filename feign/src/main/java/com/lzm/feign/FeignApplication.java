package com.lzm.feign;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
* @author 爱不留   
* @date 2018年6月4日 下午2:20:27 
**/
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

	
	@PostConstruct
	public void post() {
		
	}
	
	
	public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
	
}
