package com.Mr_stark.spring.springcoreAdvanced.Autowiring.Activity;

public class Reservation {
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	private int id;
	private String time;
}
