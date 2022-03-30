package com.juaracoding.cucumber4.utils;

public enum TestCases {
	
	T1(""),
	T2("");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
