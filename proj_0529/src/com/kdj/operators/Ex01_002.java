package com.kdj.operators;

public class Ex01_002 {

	public static void main(String[] args) {
//		증감 연산자
//		위치에 따라서 전위 증감과 후위 증감으로 나뉜다.
		int a = 0;
		int b = 1;
		
		int frontA = ++a;
		int frontB = --b;
		
		System.out.println("++a: " + frontA);
		System.out.println("++b: " + frontB);
		
		int backA = a++;
		int backB = b--;

		System.out.println("a++: " + backA);
		System.out.println("b--: " + backB);
		
		
//		겉보기에는 둘 다 차이가 없어보인다.
		
		int c = 0;
		
		System.out.println("++c: " + ++c); //출력시 1
		System.out.println("c: " + c); //출력시 1
		
//		전위 연산자의 경우, 먼저 증감 뒤 출력을 한다.
		
		System.out.println("c++: " + c++); // 출력시 1
		System.out.println("c: " + c); /// 출력시 2
		
//		후위 연산자의 경우, 출력을 먼저하고 증감 연산을 나중에 한다.
		
//		따라서, 증감 연산자는 순서를 어디에 하느냐에 따라서 달라진다.
	}

}
