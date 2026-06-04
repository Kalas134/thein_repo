package com.kdj_3;

public class MyClass {

	public static void main(String[] args) {
		Dog dog = new Dog();
//		추상화 상태이므로 오브젝트를 만들 수 없는 상태이다.
		Cat cat = new Cat();
		
		dog.animalSound();
		cat.animalSound();

	}

}
