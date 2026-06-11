package com.kdj.exp_2;

public class Ex1_02 {

    public static void main(String[] args) {

        Person person = new Person(); // Person [클래스] / person [객체]

        person.name = "홍길동";
        person.age = 20;
        person.height = 175.5;
        // Person이 가지고 있던 속성을 그래도 person이 따른다.

        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);
        System.out.println("키: " + person.height + "cm");
    }
}
