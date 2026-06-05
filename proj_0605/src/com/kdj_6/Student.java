package com.kdj_6;

class Student {
//	이름, 점수
	private String name;
	private int score;
	
//	생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
//	Getter
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}
