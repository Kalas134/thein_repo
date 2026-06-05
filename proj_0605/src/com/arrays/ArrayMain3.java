package com.arrays;

import java.util.ArrayList;

public class ArrayMain3 {

	public static void main(String[] args) {
		
		ArrayList<String> members = new ArrayList<String>();

		System.out.println(members);
		members.add("김철수");
		members.add("이영희");
		members.add("박민수");
		System.out.println(members);
		members.add("이영희");
		System.out.println(members);
	}

}
