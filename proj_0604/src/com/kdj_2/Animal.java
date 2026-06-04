package com.kdj_2;

class Animal {
	static String Myname = "=== 동물 프로그램 ===";
	
	String aniName = "동물이름";
	String aniSound = "동물소리";
	void aniEat(String aniMotion) {
		System.out.println(aniName + ": 식사시간, 위치:" + aniMotion);
	}
	void aniSleep(String aniMotion2) {
		System.out.println(aniName + ": 수면시간, 위치:" + aniMotion2);
	}

}
