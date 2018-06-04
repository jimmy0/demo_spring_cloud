package com.lzm.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 爱不留   
* @date 2018年6月4日 下午2:57:42 
**/
@FeignClient("service-hi")
public interface HiClient {

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
	
}
