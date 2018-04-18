package com.junge.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication  
@RestController
//@EnableConfigServer
@EnableDiscoveryClient
//@EnableHystrix
@EnableCircuitBreaker
@EnableHystrixDashboard
//@RequestMapping(value="/config-server")
public class App 
{
	@Autowired
	private Hystrix h;
    public static void main( String[] args )
    {
    	 SpringApplication.run(App.class,args);
    }
    @RequestMapping(value="/hello")
    public String haha(){
    	return h.zj();
    }
}
