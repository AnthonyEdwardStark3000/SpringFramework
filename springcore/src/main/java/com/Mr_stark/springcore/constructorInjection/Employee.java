package com.Mr_stark.springcore.constructorInjection;

public class Employee {
	
	Employee(int id, Address address){
		this.id = id;
		this.address = address;
	}
	
	private int id;
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
}
