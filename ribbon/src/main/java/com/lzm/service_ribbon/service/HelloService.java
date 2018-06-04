package com.lzm.service_ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 爱不留
 * @date 2018年5月31日 下午4:12:35
 **/
@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForEntity("http://SERVICE-HI/hi?name=" + name, String.class).getBody();
	}
}
