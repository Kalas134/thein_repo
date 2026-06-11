package com.kdj.exp_2;

public class Ex1_07 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    } // 값을 저장하는 메서드

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    } // 값을 가져오는 메서드

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    	Ex1_07 person = new Ex1_07();

        person.setName("홍길동");
        person.setAge(-100);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
