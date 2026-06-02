package com.kdj;

public class Car {
	int modelYear;
	String modelName;

	public Car() {
		System.out.println("기본생성자");
	}

	public Car(String modelName) {
		
//		this(2026, modelName);

		System.out.println("modelName: " + this.modelName);
		
		System.out.println(modelName);
		
		this.modelName = modelName;
		
		System.out.println("modelName: " + this.modelName);
		
	}

	public Car(int modelYear, String modelName) {

		System.out.println(this.modelYear);
		System.out.println(this.modelName);
		System.out.println(this.modelYear + " " + this.modelName);
		
		System.out.println(modelYear);
		System.out.println(modelName);
		System.out.println(modelYear + " " + modelName);
		
		this.modelYear = modelYear;
		this.modelName = modelName;

		System.out.println(this.modelYear);
		System.out.println(this.modelName);
		System.out.println(this.modelYear + " " + this.modelName);
		
		
	}

	public void printInfo() {
		System.out.println(modelYear + " -- " + modelName);
		
	}

}
