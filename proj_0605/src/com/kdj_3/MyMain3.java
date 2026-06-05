package com.kdj_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyMain3 {

	public static void main(String[] args) {
		
//		날짜만 출력
		LocalDate myObj1 = LocalDate.now();
		System.out.println(myObj1);
		
//		시간만 출력
	    LocalTime myObj2 = LocalTime.now();
	    System.out.println(myObj2);
	    
//	    날짜와 시간 출력
	    LocalDateTime myObj3 = LocalDateTime.now();
	    System.out.println(myObj3);
	    
//	    로컬 PC 기준, 날짜와 시간을 출력
	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    
	}

}
