package com.bridgelabz.AnnotPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Animal{

	@Override
	public void displayName() {
		System.out.println("Lion");
		
	}

}
