package com.bridgelabz.AntnPrimary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	
	@Bean
	@Primary
	public User getAdminUser()
	{
		return new AdminUser();
		
	}
	@Bean
	public User getGuestUser()
	{
		return new GuestUser();
		
	}

}
