package com.kdj_6;

import java.util.ArrayList;

public class ArrayMain1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("포도");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
