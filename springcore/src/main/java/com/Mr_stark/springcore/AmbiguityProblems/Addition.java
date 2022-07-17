package com.Mr_stark.springcore.AmbiguityProblems;

public class Addition {

	Addition(double a, double b) {
		System.out.println("Inside constructor Double:"+(a + b));
	}

	Addition(int a, int b) {
		System.out.println("Inside constructor Int:"+(a + b));
	}

	Addition(String a, String b) {
		System.out.println("Inside constructor String:"+a + b);
	}
}
