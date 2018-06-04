package com.lzm.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 爱不留
 * @date 2018年6月4日 下午3:00:46
 **/
@RestController
public class HiController {

	@Autowired
	HiClient hiClient;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		return hiClient.sayHiFromClientOne(name);
	}
}