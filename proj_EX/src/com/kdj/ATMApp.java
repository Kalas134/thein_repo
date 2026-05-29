package com.kdj;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int balance = 0;

	        while (true) {

	            System.out.println("\n==== ATM 메뉴 ====");
	            System.out.println("1. 입금");
	            System.out.println("2. 출금");
	            System.out.println("3. 잔액조회");
	            System.out.println("4. 종료");
	            System.out.print("선택> ");

	            int menu = sc.nextInt();

	            switch (menu) {
//	            ATM 모식도.png 참조
//	            스위치를 통해 명령을 내릴 수 있으며,
//	            Scanner에 입력을 할 때, 이에 대한 명령을 읽을 수 있도록
//	            int menu에 Scanner를 입력할 수 있게 하였다.
//	            이에 따라서 입력에 따라 각각 정해진 명령을 시행할 수 있게 된다.
//	            단, 케이스 당 항상 break를 해 주어야 그 명령에서 종료가 되며,
//	            그렇지 않을 경우, 뒤이어서 시행되는 상황이 발생하기에 주의할 필요가 있다.
	                case 1:
	                    System.out.print("입금액: ");
	                    int deposit = sc.nextInt();
	                    balance += deposit; // 기존의 값에 입력값만큼 증가
	                    System.out.println("입금 완료");
	                    break;

	                case 2:
	                    System.out.print("출금액: ");
	                    int withdraw = sc.nextInt();

	                    if (withdraw > balance) {
	                        System.out.println("잔액 부족");
	                    } else {
	                        balance -= withdraw; // 기존의 값에 입력값만큼 차감 
	                        System.out.println("출금 완료");
	                    }
	                    break;

	                case 3:
	                    System.out.println("현재 잔액: " + balance);
	                    break;

	                case 4:
	                    System.out.println("프로그램 종료");
	                    return;

	                default:
	                    System.out.println("잘못된 입력");
	            }
	        }

	}

}