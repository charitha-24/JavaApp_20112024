package com.qualizeal.javaapp.arrays;

public class Arrays {
	public void printArray() {
		int[] arr = new int[]{1,2,3,4};
		System.out.println("Accesing of arrays using for each loop");
		for (int arr1 : arr) {
			System.out.println(arr1);
		}
		System.out.println("Normal Accesing of arrays");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}
	
	public void studentDetails() {
		int[] studentId = new int[]{34,35,36,37,38};
		System.out.println(studentId); 
		String[] firstName = {"A","B","C","D","E"};	
		System.out.println(firstName);
		
	}
}