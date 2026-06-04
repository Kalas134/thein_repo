package com.kdj_2;

public class MyMain2 {
	
	public static void main(String[] args) {
		
		System.out.println(Animal.Myname);
		
		Pig pig1 = new Pig();
//		System.out.println(pig1.pigName);
		pig1.aniName = "꿀꿀이";
		pig1.aniSound = "꿀꿀";
		System.out.println(pig1.aniName);
		System.out.println(pig1.aniSound);
		pig1.aniEat("헛간");
		pig1.aniSleep("헛간");
		
		Cat cat1 = new Cat();
//		System.out.println(cat1.catName);
		cat1.aniName = "냐옹이";
		cat1.aniSound = "냐옹";
		System.out.println(cat1.aniName);
		System.out.println(cat1.aniSound);
		cat1.aniEat("부뚜막");
		cat1.aniSleep("부뚜막");
		
		Dog dog1 = new Dog();
//		System.out.println(dog1.dogName);
		dog1.aniName = "멍멍이";
		dog1.aniSound = "멍멍";
		System.out.println(dog1.aniName);
		System.out.println(dog1.aniSound);
		dog1.aniEat("아랫목");
		dog1.aniSleep("아랫목");
		
		Bird bird1 = new Bird();
//		System.out.println(bird1.birdName);
		bird1.aniName = "짹짹이";
		bird1.aniSound = "짹짹";
		System.out.println(bird1.aniName);
		System.out.println(bird1.aniSound);
		bird1.aniEat("나뭇가지 위");
		bird1.aniSleep("나뭇가지 위");
//		공통적으로 Animal을 상속받는다.
	}
}
