package com.kdj.exp_2;

public class Ex1_04 {

    String name;
    int age;

    Ex1_04(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("객체가 생성되었습니다.");
    } // 매개변수가 있어서 먼저 실행되고

    public static void main(String[] args) {

    	Ex1_04 person = new Ex1_04("홍길동", 20);

        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);
    } // 이후에 적용이 된다.
}
