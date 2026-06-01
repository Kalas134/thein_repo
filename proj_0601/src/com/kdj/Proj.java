package com.kdj;

public class Proj {
	int x = 5;
	String name = "Alice";
	
	public void myMethod() {
		System.out.println("myMethod 실행됨");
	}

	public void myMethod(int i) {
		System.out.println(i);
//		오브젝트의 이름을 전달 받아서 출력?
		System.out.println(this);
		
		System.out.println("myObj_" + i);
		
		String str1 = "myObj_";
		System.out.println(str1 + i);
		
		String result = str1 + i;
		System.out.println(result);
		
	}
}
