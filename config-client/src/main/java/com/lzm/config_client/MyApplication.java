package com.lzm.config_client;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author 爱不留
 * @date 2018年5月25日 下午5:20:05
 **/

@SpringBootApplication
@RestController
public class MyApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${profile}")
	private String profile;

	@PostConstruct
	private void post() {
		logger.info(">>> profile:" + profile);
	}
	
	
	@RequestMapping(value = "/hi")
	public String hi() {
		return profile;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);

	}

}
