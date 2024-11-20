package com.qualizeal.javaapp.data;

public class DataType1 {
	//Integer Numbers
	byte number1;
	short number2;
	int number3;
	long number4;
	
	//Floating Decimal Numbers
	float number5;
	double number6;
	
	char ch;
	boolean bool;
	
	public void method() {
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(ch);
		System.out.println(bool + "\n");
	}
		
	public void method1() {
		//Integer Numbers
		number1 = 127;
		number2 = 3435;
		number3 = 109984033;
		number4 = 2342343243l;
		
		//Floating Decimal Numbers
		number5 = 3.5f;
		number6 = 3.545;
		
		ch = 's';
		bool = true;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(ch);
		System.out.println(bool + "\n");
	}
	
	public byte add() {
		byte num = 34;
		byte num1 = 45;
		return (byte) (num + num1);
	}	
	
}