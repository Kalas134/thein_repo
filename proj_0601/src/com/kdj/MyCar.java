package com.kdj;

public class MyCar {
	public MyCar() {
		
	}
	
	// 오브젝트가 초기화될 때, 2 값을 사용
	public MyCar(int i) {
		
	}
	
	// 오브젝트가 초기화될 때, 1900, "number" 값을 사용
	public MyCar(int i, String string) {
		System.out.println(i + " " + string);
	}
}
