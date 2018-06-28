package com.bridgelabz.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
private Company company;
	@Autowired
private Address address;

public Company getCompany() {
	return company;
}
public Address getAddress() {
	return address;
}

}
