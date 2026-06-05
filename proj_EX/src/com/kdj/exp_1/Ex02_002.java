package com.kdj.exp_1;

public class Ex02_002 {

	public static void main(String[] args) {
		// 한 줄 주석

		/*
		 * 여러 줄 주석
		 */

		// 변수 선언
		int age = 20;
		String name = "홍길동";
		double height = 175.5;

		// 출력
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);

		// 조건문
		if (age >= 20) {
		    System.out.println("성인입니다.");
		} else {
		    System.out.println("미성년자입니다.");
		}

		// 반복문 (for)
		for (int i = 1; i <= 3; i++) {
		    System.out.println("for 반복: " + i);
		}

		// 반복문 (while)
		int count = 1;
		while (count <= 3) {
		    System.out.println("while 반복: " + count);
		    count++;
		}

		// 배열
		int[] numbers = {10, 20, 30};

		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}

		// 향상된 for문
		for (int num : numbers) {
		    System.out.println(num);
		}

		// switch문
		int menu = 2;

		switch (menu) {
		    case 1:
		        System.out.println("프로그램 실행");
		        break;

		    case 2:
		        System.out.println("설정");
		        break;

		    default:
		        System.out.println("알 수 없는 메뉴");
		}

		// 메서드 호출
		int result = add(10, 20);
		System.out.println(result);
	}
	// 클래스 내부 메서드 예제
	public static int add(int a, int b) {
	    return a + b;
	}

}
