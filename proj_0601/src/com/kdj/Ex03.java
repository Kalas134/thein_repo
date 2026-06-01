package com.kdj;

public class Ex03 {

	public static void main(String[] args) {

		Calcul calculator = new Calcul();
		
		System.out.println("2 add 4: " + calculator.add(2, 4));
		System.out.println("5 subtract 1: " + calculator.subtract(5, 1));
		System.out.println("4 multiplication 5: " + calculator.multiplication(4, 5));
		System.out.println("6 division 2: " + calculator.division(6, 2));
	}

}
