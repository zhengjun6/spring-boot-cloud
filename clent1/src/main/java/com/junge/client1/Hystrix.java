package com.junge.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Hystrix {
	@Autowired
    RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="aa")
	public String zj(){
		 return restTemplate.getForObject("http://SERVICE-HI/hi?name=",String.class);
//		return "zj";
	}
	
	public String aa(){
		return "zj";
	}
	
	 	@Bean
	    @LoadBalanced
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }	
}
