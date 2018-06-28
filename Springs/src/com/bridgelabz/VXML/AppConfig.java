package com.bridgelabz.VXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
	//configure any bean here
	@Bean
	public HelloBean getHelloBean()
	{
		HelloBean hellobean=new HelloBean();
		return hellobean;
		
	}
	

}
