package com.bridgelabz.VXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloBean bean=con.getBean(HelloBean.class);
		System.out.println("Message:"+bean.hello());		

	}

}
