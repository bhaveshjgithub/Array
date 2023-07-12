package com.array.practice;

public class ArrayRotate {
	/*Program to left rotate the elements of an array
	Original Array:
	1   2   3   4   5
	Array after left rotation:
	5   1   2   3   4   
	*/
	public static void main(String[] args) {
		 int [] ori = {1,2,3,4,5};
		 int [] rot = new int[ori.length];
		 for(int i = 0; i<ori.length;i++) {
			 rot[i] = ori[i + 1];
			 rot[ori.length - 1] = ori[0];
			 
//			 for(int j=i;j<ori.length;j++) {
//				 ori[i] = rot[j-1];
				 System.out.println(rot[i]);
			 }
		 
		 }
		 
	}
	
	

