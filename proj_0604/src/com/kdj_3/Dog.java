package com.kdj_3;
//	추상화
class Dog extends Animal{
//	추상 메서드
//	abstract void animalSound();
	@Override
	void animalSound() {
		System.out.println("멍멍");
	}
}
