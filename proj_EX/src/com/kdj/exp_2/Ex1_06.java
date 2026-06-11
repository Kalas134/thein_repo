package com.kdj.exp_2;

public class Ex1_06 {

    public String brand = "Hyundai";

    public void drive() {
        System.out.println("주행 중");
    }

    public static void main(String[] args) {

    	Ex1_06 car = new Ex1_06();

        System.out.println(car.brand);
        car.drive();
    }
    // public		(어디든 접속 가능)
    // private		(같은 클래스 내부에서만 접근 가능)
    // protected	(같은 패키지, 상속받은 자식 클래스에서만 접근 가능)
    // (아무것도 없음)	(같은 패키지 내에서만 접근이 가능함)
    // final		(값 변경 불가)
    // static		(객체없이 사용 가능)
}
