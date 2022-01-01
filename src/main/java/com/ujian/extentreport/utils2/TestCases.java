package com.ujian.extentreport.utils2;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Testing menu register"),
	T3("Testing menu login"),
	T4("Testing menu addcart"),
	T5("Testing open source cartpage"),
	T6("Testing open source checkout");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
