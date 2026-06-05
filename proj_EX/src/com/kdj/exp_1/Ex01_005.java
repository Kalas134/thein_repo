package com.kdj.exp_1;

public class Ex01_005 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 7;
		
		System.out.println("a > b: " + (a > b));
		System.out.println("b < c: " + (b < c));
		System.out.println("a < b: " + (a < b));
		System.out.println("b > c: " + (b > c));
		
		System.out.println("(a > b) && (b < c): " + ((a > b) && (b < c)));
		System.out.println("(a > b) && (b > c): " + ((a > b) && (b > c)));
		System.out.println("(a < b) && (b < c): " + ((a < b) && (b < c)));
		System.out.println("(a < b) && (b > c): " + ((a < b) && (b > c)));
		
		System.out.println("(a > b) || (b < c): " + ((a > b) && (b < c)));
		System.out.println("(a > b) || (b > c): " + ((a > b) && (b > c)));
		System.out.println("(a < b) || (b < c): " + ((a < b) && (b < c)));
		System.out.println("(a < b) || (b > c): " + ((a < b) && (b > c)));
		
		System.out.println("(a > b) != true: " + ((a > b) != true));
		System.out.println("(b < c) != false: " + ((b < c) != false));
		
	}

}
