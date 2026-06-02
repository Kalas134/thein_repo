package com.kdj;

public class Pig_Inter implements Animal_Inter {
	
	@Override
	public void animalSound() {
		System.out.println("꿀꿀꿀-인터페이스 구현완료");
	}
	@Override
	public void sleep() {
		System.out.println("꿈나라-인터페이스 구현완료");
	}
	
}
