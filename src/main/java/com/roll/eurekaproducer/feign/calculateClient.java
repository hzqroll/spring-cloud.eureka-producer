package com.roll.eurekaproducer.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;

import feign.RequestLine;

/**
 * Created by haozq
 * Date: 2018/5/28 下午5:54
 */
@FeignClient(value = "calculate-server", configuration = FooConfiguration.class)
public interface calculateClient {

	@RequestLine("get-result")
	long getResult(Map<String, Object> params);
}
