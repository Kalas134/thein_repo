package com.kdj_4;

abstract class Animal implements InterAnimal{

	@Override
	public void run() {
		System.out.println("동물이 달린다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
