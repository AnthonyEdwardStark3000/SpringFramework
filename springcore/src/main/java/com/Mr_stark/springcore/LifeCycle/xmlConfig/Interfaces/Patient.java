package com.Mr_stark.springcore.LifeCycle.xmlConfig.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{
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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("After properties set");
		greet();
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Destroy method");
		bye();
	}
	
}
