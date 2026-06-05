package com.kdj.exp;

public class Ex01_010 {

	public static void main(String[] args) {
//		연산자의 우선 순위는 다음과 같이 알 수 있다.
		int result1 = 3 + 4 * 2;

		System.out.println(result1);
		
//		3 + (4 * 2)
//		3 + 8
//		11
		
		boolean result2 = 10 > 5 && 3 < 1;

		System.out.println(result2);
		
//		(10 > 5) && (3 < 1)
//		true && false
//		false
		
		int a = 5;
		int b = 10;

		int result3 = a + b > 12 ? 100 : 0;

		System.out.println(result3);
		
//		(a + b) > 12
//		15 > 12
//		true ? 100 : 0
//		100
		
//		괄호 > 단항(++, --, !등) > 산술(+, -, *, /, %) > 비교(<, >, ==, !=) > 논리(&&, ||) > 대입(=)
	}

}
