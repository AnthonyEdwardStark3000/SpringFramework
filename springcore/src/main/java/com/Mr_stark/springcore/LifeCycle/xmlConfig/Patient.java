package com.Mr_stark.springcore.LifeCycle.xmlConfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void greet() {
		System.out.println("\nStarted the program.");
	}

	public void bye() {
		System.out.println("\nEnded the program.");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}
