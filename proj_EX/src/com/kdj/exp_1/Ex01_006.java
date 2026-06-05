package com.kdj.exp_1;

public class Ex01_006 {

	public static void main(String[] args) {
		int a = 5; // 0101
		int b = 3; // 0011
		
		System.out.println(a & b); // AND  0001 -> 1
		System.out.println(a | b); // OR   0111 -> 7

		System.out.println(a ^ b); // XOR  0110 -> 6
		System.out.println(~a);    // NOT  (설명은 아래에)
		
//		5  = 00000000 00000000 00000000 00000101
//		~5 = 11111111 11111111 11111111 11111010
//			    = -6
	}

}
