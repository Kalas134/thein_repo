package com.kdj.datatype;

public class Ex_DataType {

	public static void main(String[] args) {
		int myIntNum = 5;				// 4 byte(32Bit)
		float myFloatNum = 5.99f;
		char meLetter = 'D';
		boolean myBool = true;// 8 byte(64Bit)
		double myDouble = 20.000;
		String myText = "Hello";
		
		System.out.println("자동 타입 캐스팅\n ------------ \n byte-> short-> char-> int -> long-> float-> double");
		
		System.out.println("수동 타입 캐스팅\n ------------ \n double-> float-> long-> int-> char-> short-> byte ");
		
//		int --> double
		double resultDouble = myIntNum;
		System.out.println("int타입의 값(" + myIntNum +")을 double타입의 변수에 대입: " + resultDouble + "\n");
		
//		double --> int
		int resultInt = (int) myDouble;
		System.out.println("double타입의 값(" + myDouble + ")을 int타입의 변수에 대입\n ***타입캐스팅이 필요함*** : \n" + resultInt);
		
		System.out.println("\n ------------ \n");
		
		int z = 5;
		System.out.println(z);
		--z;
		--z;
		--z;
		System.out.println(z);
	}

}
