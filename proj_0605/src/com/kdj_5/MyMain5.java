package com.kdj_5;

import java.util.ArrayList;

public class MyMain5 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		System.out.println(cars);
		
		cars.add("볼보");
		cars.add("BMW");
		cars.add("포드");
		cars.add("마츠다");

		System.out.println(cars);
		
		cars.add(0, "추가된 자동차");
		System.out.println(cars);
		

		System.out.println(cars.get(0));
		cars.set(0, "XO3");
		System.out.println(cars);
	}

}
