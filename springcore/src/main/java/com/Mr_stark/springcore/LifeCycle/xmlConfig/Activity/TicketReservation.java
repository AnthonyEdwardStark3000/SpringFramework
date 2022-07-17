package com.Mr_stark.springcore.LifeCycle.xmlConfig.Activity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	public void samplePrint() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("...");
		}
	}

	@PostConstruct
	public void start() {
		System.out.println("Reservation starts");
		samplePrint();
	}

	@PreDestroy
	public void end() {
		System.out.println("Reservation completed");
	}
}
