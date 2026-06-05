package com.kdj_1;

public class MyMain1 {

	public static void main(String[] args) {
//		익명 클래스
		
		Greeting greet = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("나는 인터페이스를 구현한 익명클레스다.");
				
			}
			
		};
		greet.sayHello();
	}

}
