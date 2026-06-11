package com.kdj.exp_2;

public class Ex1_05 {

    String name;

    Ex1_05(String name) {
        this.name = name; // 객체의 필드(this.name), 생성자의 매개변수(name)
    }

    public static void main(String[] args) {

    	Ex1_05 person = new Ex1_05("홍길동");

        System.out.println(person.name);
    }
}
