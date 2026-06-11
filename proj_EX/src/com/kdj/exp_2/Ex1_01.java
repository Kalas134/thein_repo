package com.kdj.exp_2;

public class Ex1_01 {

    public static void main(String[] args) {

        Car car1 = new Car(); // Car [클레스] 사용 ==> car1 생성
        car1.brand = "Hyundai"; // 따라서 Car 클레스에 있는 [속성]을 따른다.[객체]
        car1.speed = 100;

        Car car2 = new Car();
        car2.brand = "Kia";
        car2.speed = 80;

        System.out.println("차량1: " + car1.brand + ", 속도: " + car1.speed);
        car1.drive(); // 이는, 지정된 클래스 내의 [메서드]도 마찬가지다.

        System.out.println("차량2: " + car2.brand + ", 속도: " + car2.speed);
        car2.drive();
    }
}
