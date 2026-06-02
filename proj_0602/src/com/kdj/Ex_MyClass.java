package com.kdj;

public class Ex_MyClass {

	public static void main(String[] args) {
//		Car 클래스를 사용(car1을 사용하므로써.)
		Car car1 = new Car();
		Car car2 = new Car("붕붕이");
		Car car3 = new Car(1960, "Mustang");
		
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
	}

}
