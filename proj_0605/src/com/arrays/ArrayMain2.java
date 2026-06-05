package com.arrays;

import java.util.ArrayList;

public class ArrayMain2 {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		scores.add(80);
		scores.add(90);
		scores.add(70);
		scores.add(100);
		System.out.println(scores);
		
		int sum = 0;
		int num = 0;
		
		for(int score : scores) {
			sum += score;
			num++;
			System.out.println(sum + "/" + num);
		}
		
		double avg = (double)(sum / scores.size());
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}

}
