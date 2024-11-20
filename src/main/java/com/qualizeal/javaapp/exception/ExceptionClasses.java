package com.qualizeal.javaapp.exception;

public class ExceptionClasses {
	int number = 324;
	int number1 = 3453;
	int number2 = 0;
	int result;
	public void printException() {
		result = number / number1;
		System.out.println("Result1 = " + result);
		/*
		result = number1 / number2;
		System.out.println("Result2 = " + result);*/
	}
}