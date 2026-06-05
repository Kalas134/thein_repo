package com.kdj.exp_1;

public class Ex01_001 {

	public static void main(String[] args) {
//		기본 산술연산자
		int intA = 2;
		int intB = 5;
		
		System.out.println("산술연산자\n---------\n[기본값]");
		System.out.println("intA = 2\nintB = 5\n");
//		합산
		System.out.println("intA + intB= " + (intA + intB));
//		빼기
		System.out.println("intB - intA= " + (intB - intA));
//		곱하기
		System.out.println("intA * intB= " + (intA * intB));
//		나누기
		System.out.println("intA / intB= " + (intA / intB));
//		나머지 값
		System.out.println("intA % intB= " + (intA % intB));
		System.out.println("intB % intA= " + (intB % intA));
	}

}
