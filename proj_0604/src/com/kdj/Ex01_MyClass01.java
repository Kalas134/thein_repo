package com.kdj;

public class Ex01_MyClass01 {

	public static void main(String[] args) {
		 Account acc = new Account("100-200", "성운철", 100000);
		 
//		  ----- 출력부 ----
		 
		 System.out.println(acc.exportPrint());
		 
		 acc.deposit(50000);
		 System.out.println(acc.exportPrint());
		 
		 acc.withdrow(20000);
		 System.out.println(acc.exportPrint());
//		 입금 8,000
//		 String depositResult = acc.deposit(8000);
//		 System.out.println(depositResult);
////		 출금 10,000
//		 String WithdrowResult = acc.withdrow(10000);
//		 System.out.println(WithdrowResult);
	}

}
