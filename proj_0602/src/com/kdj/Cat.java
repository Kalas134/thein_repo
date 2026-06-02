package com.kdj;

public class Cat extends Animal {
	public void animalSound() {
		System.out.println("냐오옹");
	}
	public void animalColor(boolean Flag) {
		if (Flag) {
			super.animalColor();
		} else {
			System.out.println("yellow");
		}
	}
}
