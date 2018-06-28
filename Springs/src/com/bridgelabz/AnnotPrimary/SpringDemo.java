package com.bridgelabz.AnnotPrimary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		//context.refresh();
		Animal animal=context.getBean(Animal.class);
		animal.displayName();
		context.registerShutdownHook();
		
	}

}
