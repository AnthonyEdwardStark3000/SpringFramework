package com.Mr_stark.springcore.propertyPlaceholder.Activity;

public class External {
	String url, userName, password;

	External(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "External [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
}
