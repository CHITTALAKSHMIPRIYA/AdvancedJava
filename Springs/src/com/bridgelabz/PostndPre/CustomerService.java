package com.bridgelabz.PostndPre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {
String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
@PostConstruct
public void init()
{
	System.out.println("Init method after properties are set : " + message);
}
@PreDestroy
public void destroy()
{
	System.out.println("destroy");
}
}
