package com.Mr_stark.springcore.activity;

import java.util.Map;

public class Country {
	private int id;
	private Map<String, String> countyVal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String> getCountyVal() {
		return countyVal;
	}

	public void setCountyVal(Map<String, String> countyVal) {
		this.countyVal = countyVal;
	}
}
