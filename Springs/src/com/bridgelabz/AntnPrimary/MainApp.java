package com.bridgelabz.AntnPrimary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = 
		            new AnnotationConfigApplicationContext(AppConfig.class);
		 User u=context.getBean(User.class);
		 u.doSomething();
		 context.close();

	}

}
