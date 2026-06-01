package com.kdj;

public class Ex01 {

	public static void main(String[] args) {
//		클래스와 객체의 개념에 대하여.
		Proj myObj_1 = new Proj();
		Proj myObj_2 = new Proj();
		Proj myObj_3 = new Proj();
		String str = "Karma";
		int num = 7;
		
		System.out.println(myObj_1);
		System.out.println(myObj_1.x);
		System.out.println(myObj_2);
		System.out.println(myObj_2.x);
		System.out.println(myObj_3);
		System.out.println(myObj_3.x);
		myObj_3.x = 7;
		myObj_3.name = "Albet";
		System.out.println(myObj_3);
		System.out.println(myObj_3.x);
		System.out.println(myObj_3.name);
		
		myObj_1.myMethod();
		myObj_2.myMethod();
		myObj_3.myMethod();
		
		myObj_1.myMethod(1);
		myObj_2.myMethod(2);
		myObj_3.myMethod(3);
	}

}
