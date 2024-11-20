package com.qualizeal.javaapp.scope;

public class ScopeCheck {
	public void show() {
		System.out.println("Public method");
	}
	
	protected void show1() {
		System.out.println("protected method");
	}
	
	void show2() {
		System.out.println("private method");
	}
	
	void show3() {
		System.out.println("Default method");
	}
}