package com.test;

public class SampleMavenProject {
	
	public static void main(String[] args) {
		
		System.out.println("Inside MAIN method start execution.........");
		
		int x = add(2, 2);
		System.out.println("Returning the SUM value:--> " + x );
	}
	
	public static int add(int a, int b) {
		System.out.println("Inside add() method...........");
		
		
		
		return a + b;
	}
}
