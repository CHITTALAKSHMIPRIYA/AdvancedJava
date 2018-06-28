package com.bridgelabz.AntnPrimary;

import org.springframework.stereotype.Component;

@Component
public class GuestUser implements User{

	@Override
	public void doSomething() {
		System.out.println("Guest user");
	}

}
