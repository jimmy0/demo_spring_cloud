package com.lzm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 爱不留
 * @date 2018年5月25日 下午5:20:05
 **/

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	


	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);

	}

}
