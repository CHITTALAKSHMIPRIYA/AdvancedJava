package com.bridgelabz.PostndPre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("postpre.xml");
		CustomerService cs=con.getBean("customerService",CustomerService.class);
		System.out.println(cs);
		((AbstractApplicationContext) con).close();

	}

}
