package com.lzm.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 爱不留
 * @date 2018年5月29日 下午5:21:19
 **/
@SpringBootApplication
@RestController
public class MyApplication {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
