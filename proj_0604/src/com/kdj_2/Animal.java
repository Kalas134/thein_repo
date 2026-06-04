package com.kdj_2;

class Animal {
	static String Myname = "=== 동물 프로그램 ===";
	
	String aniName = "동물이름";
	String aniSound = "동물소리";
	String aniEatting;
	String aniSleeping;
	int aniAge;
	
	void Aging(int age) {
		aniAge += age;
	}
	void eating(String eat) {
		aniEatting = "동물이 먹이를 먹습니다.";
	}
	void sleeping() {
		aniEatting = "동물이 잠을 잡니다.";
	}
	
	void Info() {
		System.out.println(
				"동물의 이름은 " + aniName + 
				"\n동물의 소리는 " + aniSound + 
				"\n동물의 나이는 " + aniAge + 
				"\n동물이 먹는 모습은 " + aniEatting + 
				"\n동물이 자는 모습은 " + aniSleeping);
	}
//	void aniEat(String aniMotion) {
//		System.out.println(aniName + ": 식사시간, 위치:" + aniMotion);
//	}
//	void aniSleep(String aniMotion2) {
//		System.out.println(aniName + ": 수면시간, 위치:" + aniMotion2);
//	}

}
