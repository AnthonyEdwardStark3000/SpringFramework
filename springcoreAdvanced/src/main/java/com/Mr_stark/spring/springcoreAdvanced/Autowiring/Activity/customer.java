package com.Mr_stark.spring.springcoreAdvanced.Autowiring.Activity;

import org.springframework.beans.factory.annotation.Autowired;

public class customer {
	private String name;
	Reservation reservation;

	@Override
	public String toString() {
		return "customer [name=" + name + ", reservation=" + reservation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	@Autowired
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}
