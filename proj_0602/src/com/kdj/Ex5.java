package com.kdj;

public class Ex5 {

	public static void main(String[] args) {
//		StaticClass staticClass = new StaticClass();
		
		System.out.println(StaticClass.staticVal);
		
		System.out.println("변경전: " + StaticClass.staticIntVal);
		
		StaticClass.staticIntVal = 999;
		System.out.println("변경후: " + StaticClass.staticIntVal);
		
		
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass s3 = new StaticClass();
		
		System.out.println("변경전: " + s1.color);
		
		s1.color = "red";
		s2.color = "yellow";
		s3.color = "green";
		
		System.out.println("변경후: " + s1.color);
	}

}
