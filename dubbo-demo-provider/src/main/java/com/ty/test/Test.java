package com.ty.test;

public class Test implements ITest {

	@Override
	public String getTest(String name) {
		System.out.println("name:::"+name);
		return "test success!!!";
	}

}
