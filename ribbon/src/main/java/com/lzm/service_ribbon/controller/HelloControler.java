package com.lzm.service_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lzm.service_ribbon.service.HelloService;

/**
* @author 爱不留   
* @date 2018年5月31日 下午4:28:34 
**/
@RestController
public class HelloControler {

	@Autowired
    private HelloService helloService;
	
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
