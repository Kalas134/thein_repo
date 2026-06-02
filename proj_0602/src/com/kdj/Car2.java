package com.kdj;

public class Car2 extends Vehicle2 {
	String modelName = "Mustang";

	public void honk() {
		System.out.println("크랙션 발생.");
		System.out.println("super필드: " + super.brand); // 부모의 메서드도 사용할 수 있다.
	}
}
