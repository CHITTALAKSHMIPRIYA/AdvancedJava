package com.bridgelabz.AutowireByConstructor;



public class Employee {
private int id;
private String name;
private Pancard pancard;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Pancard getPancard() {
	return pancard;
}
public Employee(int id,String name,Pancard pancard)
{
	super();
this.id=id;
this.name=name;
this.pancard=pancard;
}
	
}
