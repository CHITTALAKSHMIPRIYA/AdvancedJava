package com.bridgelabz.J2eeContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class UserMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("user.xml");
		User u=context.getBean("user",User.class);
		User u1=context.getBean("user1",User.class);
		System.out.println(u);
		System.out.println(u1);

	}

}
