package com.kdj.exp;

public class Ex_MainAccount {

	public static void main(String[] args) {
		
		Account acc = new Account("100-200", "성운철", 100000);
		
		acc.deposit(2000);
		acc.withdrow(3000);
		acc.showInfo();

	}

}
