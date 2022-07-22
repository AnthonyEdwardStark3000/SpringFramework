package com.Mr_stark.spring.springjdbc.employee.entity;

public class Employee {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Id:"+id);
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		System.out.println("Check:"+firstName);
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private int id;
	private String firstName;
	private String lastName;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
