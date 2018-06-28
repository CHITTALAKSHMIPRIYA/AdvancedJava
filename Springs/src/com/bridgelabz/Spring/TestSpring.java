package com.bridgelabz.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaruant obj=context.getBean("restaruantBean",Restaruant.class);
		obj.greetCustomer();

	}

}
