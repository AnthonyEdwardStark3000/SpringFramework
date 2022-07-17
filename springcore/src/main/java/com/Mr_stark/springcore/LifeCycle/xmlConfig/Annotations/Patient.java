package com.Mr_stark.springcore.LifeCycle.xmlConfig.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void greet() {
		System.out.println("\nStarted the program.");
	}

	@PreDestroy
	public void bye() {
		System.out.println("\nEnded the program.");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
