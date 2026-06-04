package com.kdj;

class Account {

	String accountNumber;
	String owner;
	int balance;

//	생성자 구현
	Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
//
//	String deposit(int amount) {
//		this.balance += amount;
//		return ("입금 후 잔액: " + balance);
//	}
//
//	String withdrow(int Withdrawal_amount) {
//		this.balance -= Withdrawal_amount;
//		return ("출금 후 잔액: " + balance);
//	}
//	

	
	
//	----- 기능구현 ------

//	기능구현 - 입금
	void deposit(int amount) {
		this.balance += amount;
	}
	
	
//	기능구현 - 출금
	void withdrow(int amount) {
		this.balance -= amount;
	}

//	----- 출력 구현 -----
	
//	기능구현 - 출력
	String exportPrint() {
		return ("잔액: " + balance);
	}
	
	
}
