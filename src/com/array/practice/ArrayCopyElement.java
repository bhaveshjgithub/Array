package com.array.practice;
//Program to copy all elements of one array into another array
public class ArrayCopyElement {
	public static void main(String[] args) {
		int [] marks = {1,2,34,4,56,7,8,9};
		///int [] marks = new int [] {1, 2, 3, 4, 5};
		int copym[] = new int [marks.length];
		
		System.out.println("Element in array 2 is : " );
		for(int i=0; i<marks.length;i++)
		{
			copym[i] = marks[i];
			System.out.print(copym[i] + " ");
		}	
		System.out.println("\n");
		System.out.println("Element in array 1 is : " );
		for(int i=0; i<marks.length;i++)
		{
			
			System.out.print(marks[i]+ " ");
		}	
		
	}
	
}
