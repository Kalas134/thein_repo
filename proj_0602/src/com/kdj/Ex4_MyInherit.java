package com.kdj;

public class Ex4_MyInherit {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Pig pig = new Pig();
		Dog dog = new Dog();
		
		animal.animalSound(); // 기존의 Animal 에 있는 것.
		pig.animalSound(); // 기존의 Animal 에서 재정의 된 상황이다.
		dog.animalSound();
		
//		=========== 
		
//		1. 고양이 Cat으로 오브젝트 생성
		Cat cat = new Cat();
		
//		2. 동물들의 털 색상 color 출력
		cat.animalSound();
		
		pig.animalColor();
		dog.animalColor();
		cat.animalColor(true);
		
//		3. 치즈냥이 털 색상 출력
		cat.animalColor(false);
		
		
		}
}
