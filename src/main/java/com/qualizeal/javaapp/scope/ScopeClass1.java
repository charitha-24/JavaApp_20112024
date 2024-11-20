package com.qualizeal.javaapp.scope;

public class ScopeClass1 {
	public static void main(String[] args) {
		ScopeCheck scopeCheck = new ScopeCheck();
		scopeCheck.show();
		scopeCheck.show1();
		//scopeCheck.show2(); -->Private can't be used outside the class
		scopeCheck.show3();
	}	
}