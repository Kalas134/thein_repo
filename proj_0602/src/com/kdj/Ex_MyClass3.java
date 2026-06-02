package com.kdj;

public class Ex_MyClass3 extends Vehicle {
	
	private String modelName = "Mustang";

	public static void main(String[] args) {
//		상속의 개념에 대하여
		
		
//		Vehicle vehicle = new Vehicle();
//		vehicle.honk();
		
		Ex_MyClass3 ex_MyClass3_1 = new Ex_MyClass3();
		
		ex_MyClass3_1.honk();
		
		System.out.println(ex_MyClass3_1.modelName);
		System.out.println(ex_MyClass3_1.brand);
	}
}