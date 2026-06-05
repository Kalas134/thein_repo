package com.kdj_6;

public class MyMain6 {
	
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			} else {
				System.out.println("Access granted - You are old enough!");
				}
		}

	public static void main(String[] args) {
		
//		try catch
//		try {
//			int[] myNumbers1 = { 1, 2, 3 };
//			System.out.println(myNumbers1[10]); // error!!
//		} catch (Exception e) {
//			System.out.println("something was wrong: " + e);
//		}
//		
//		try catch - finally
		
//		try {
//			int[] myNumbers2 = { 1, 2, 3 };
//			System.out.println(myNumbers2[5]);
//		} catch(Exception e) {
//			System.out.println("something was wrong: " + e);
//		} finally {
//			System.out.println("try-catch end");
//		}

//		throw
//	    checkAge(15); // Set age to 15 (which is below 18...)
		
//		다중 Exception애서 사용순서를 꼭 지킬 것!
		
//	    try {
//	    	int[] numbers = {1, 2, 3};
//	        System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
//	        int result = 10 / 0;              // ArithmeticException
//	      } 
//	      catch (ArrayIndexOutOfBoundsException e) {
//	        System.out.println("Array index does not exist.: " + e);
//	      } 
//	      catch (ArithmeticException e) {
//	        System.out.println("Cannot divide by zero.: " + e);
//	      } 
//	      catch (Exception e) {
//	        System.out.println("Something else went wrong.: " + e);
//	      }
	}

}
