package com.kdj;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("=== 두 숫자의 합을 구하기 ===");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int m = sc.nextInt();
		
		System.out.println("두 숫자의 합: " + (n + m));
		
	}

}
