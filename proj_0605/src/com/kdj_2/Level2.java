package com.kdj_2;

enum Level2 {
	  // Enum constants (each has its own description)
	  LOW("Low level"),
	  MEDIUM("Medium level"),
	  HIGH("High level");

//	  enum애서 사용할 변수
	  private String description;
	  
//	  enum 생성자
	  private Level2(String description) {
	    this.description = description;
	  }

//	  enum Getter
	  public String getDescription() {
	    return description;
	  }
	}
