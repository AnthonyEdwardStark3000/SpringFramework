package com.Mr_stark.spring.springcoreAdvanced.Autowiring.Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	Address address;

	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
