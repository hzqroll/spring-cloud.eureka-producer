package com.roll.eurekaproducer.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

/**
 * Created by haozq
 * Date: 2018/5/28 下午6:59
 */
@Configuration
public class FooConfiguration {

	//使用Feign自己的注解，使用springmvc的注解就会报错
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
}
