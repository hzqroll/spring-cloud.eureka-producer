package com.roll.eurekaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

/**
 * Created by haozq
 * Date: 2018/5/21 上午9:08
 */
@RestController
public class HelloController {


	@RequestMapping("/hello")
	public String say(){
		return "eureka-client";
	}
}
