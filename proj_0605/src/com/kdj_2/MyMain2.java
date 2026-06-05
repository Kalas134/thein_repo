package com.kdj_2;

public class MyMain2 {

	public static void main(String[] args) {
//		Level myVar = Level.MEDIUM;
//		System.out.println(myVar);
//		
//		switch(myVar) {
//		case LOW:
//			System.out.println("LOW 커피 로스팅 주문");
//			break;
//		case MEDIUM:
//			System.out.println("MEDIUM 커피 로스팅 주문");
//			break;
//		case HIGH:
//			System.out.println("HIGH 커피 로스팅 주문");
//			break;
//		} 
//		
//		for(Level myVar2 : Level.values()) {
//			System.out.println(myVar2);
//		}
		
		System.out.println("=====Level 2=====");
		
	    Level2 myVar2 = Level2.MEDIUM; // Pick one enum constant
	    System.out.println(myVar2.getDescription()); // Prints "Medium level"
	    
	    for(Level2 v2 : Level2.values()) {
	    	System.out.println(v2 + ": " + v2.getDescription());
	    }
	  }

}
