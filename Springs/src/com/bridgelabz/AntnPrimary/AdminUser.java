package com.bridgelabz.AntnPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdminUser implements User{

	@Override
	public void doSomething() {
		System.out.println("Admin user class");
		
	}

}
