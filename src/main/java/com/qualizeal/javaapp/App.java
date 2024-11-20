package com.qualizeal.javaapp;

import com.qualizeal.javaapp.data.DataType1;
import com.qualizeal.javaapp.exception.ExceptionClasses;
import com.qualizeal.javaapp.inherit.Greet;
import com.qualizeal.javaapp.inherit.Greet1;
import com.qualizeal.javaapp.inherit.Greet2;
import com.qualizeal.javaapp.interfaceconcept.ImplentClass1;
import com.qualizeal.javaapp.interfaceconcept.ImplentClass2;
import com.qualizeal.javaapp.scope.ScopeCheck;
import com.qualizeal.javaapp.arrays.Arrays;

public class App {
    public static void main(String[] args) {
    	System.out.println("Main Started");
    	System.out.println("DataType1 Class started.");
    	DataType1 dataType1 = new DataType1();
    	System.out.println("The following are the default values of all Data Types : ");
    	dataType1.method();
    	System.out.println("The following are the default values of all Data Types : ");
    	dataType1.method1();
    	System.out.println("The following will print the datatype addition : ");
    	dataType1.add();
    	
    	System.out.println("Exception Class started.");
    	ExceptionClasses exceptionClasses = new ExceptionClasses();
    	exceptionClasses.printException();
    	
    	System.out.println("Scope check Class started.");
    	ScopeCheck scopeCheck = new ScopeCheck();
    	scopeCheck.show();//only public can be acceses in another package
    	
    	System.out.println();
    	System.out.println("Accesing methods within class.");
    	App app = new App();
    	app.hi();
    	app.hi1();
    	app.hi2();
    	app.hi3();
    	System.out.println();
    	 
    	//used when static keyword is used with the methods
    	System.out.println();
    	System.out.println("Accesing methods within class using static keywords.");
    	hello();
    	hello1();
    	hello2();
    	hello3();
    	
    	System.out.println();
    	System.out.println("Arrays Printing.");
    	Arrays arrays = new Arrays();
    	arrays.printArray();
    	
    	System.out.println();
    	System.out.println("Parent Class usage in inheritance concept.");
    	Greet parentClass = new Greet();
    	parentClass.hi();
    	parentClass.hello();
    	
    	System.out.println();
    	System.out.println("Child Class1 usage in inheritance concept.");
    	Greet1 childClass1 =  new Greet1();
    	childClass1.bye();
    	childClass1.hi();
    	childClass1.hello();
    	
    	System.out.println();
    	System.out.println("Child Class2 usage in inheritance concept.");
    	Greet2 childClass2 =  new Greet2();
    	childClass2.hy();
    	childClass2.hi();
    	childClass2.hello();
    	
    	System.out.println();
    	System.out.println("Interface Class1 accesing using interface concept.");
    	ImplentClass1 implentClass1 = new ImplentClass1();
    	implentClass1.hi();
    	implentClass1.hy();
    	
    	ImplentClass2 implentClass2 = new ImplentClass2();
    	implentClass2.hy();
    	implentClass2.hi();
}
    public void hi() {
    	System.out.println("Hi from public method");
    }
    
    protected void hi1() {
    	System.out.println("Hi1 from protected method");
    }
    
    
    private void hi2() {
    	System.out.println("Hi2 from private method");
    }
    
    void hi3() {
    	System.out.println("Hi3 from default method");
    }
    
    public static void hello() {
    	System.out.println("hello from public static method");
    }
    
    protected static void hello1() {
    	System.out.println("hello1 from protected static method");
    }
    
    private static void hello2() {
    	System.out.println("hello2 from private static method");
    }
    
    static void hello3() {
    	System.out.println("hello3 from default static method");
    }
}
