package com.lzm.service_ribbon;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.lzm.service_ribbon.service.HelloService;

/**
* @author 爱不留   
* @date 2018年5月31日 下午4:08:59 
**/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RibbonApplication {

	@Autowired  
    private RestTemplateBuilder builder;  
	
	@LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	
	@Autowired
    public HelloService helloService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
	
	
}
