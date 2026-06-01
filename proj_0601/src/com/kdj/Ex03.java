package com.kdj;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Calcul calculator = new Calcul();
		int num1;
		int num2;
		String operator;
		
		System.out.print("1st num? ");
		num1 = sc.nextInt();

		System.out.print("연산자(+, -, *, /, %)? ");
		operator = sc.next();
		

		System.out.print("2st num? ");
		num2 = sc.nextInt();
		
		switch (operator) {
		case "+":
			calculator.add(num1, num2);
			break;
		case "-":
			calculator.subtract(num1, num2);
			break;
		case "*":
			calculator.multiplication(num1, num2);
			break;
		case "/":
			calculator.division(num1, num2);
			break;
		case "%":
			calculator.remainder(num1, num2);
		}
	}

}
