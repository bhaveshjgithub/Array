package com.array.practice;

public class Array_1 {
	public static void main(String[] args) {
	/* class of 500 student :- Store Marks of This 500 students 
	1. Create 500 VAriable 
	2. Use array (Recommended) 
	 int [] marks = new int [5]
	 */
	int [] marks = new int [5];
	marks[0] = 100;
	marks[1] = 90;
	marks[2] = 80;
	marks[3] = 70;
	marks[4] = 60;
	//marks[5] = 50; >>ArrayIndexOutOfBond Exception... 
	System.out.println(marks[5]);
	// Array is collection of 
	// Array Starts with Zero 
	//Faster Retrive of Element
	
	// Three Way to Create Array
	//*  1. >>>>> Declaration>>> Memory allocation
	int[] marks1; 
	marks = new int [5]; 
	// 2. >>  >> Declare + Initialization
	int[] marks2 = {100,90,80,70,60};
}

}
