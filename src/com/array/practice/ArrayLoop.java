package com.array.practice;

public class ArrayLoop {
 public static void main(String[] args) {
	
	 int [] marks = {100,90,80,70,60};
	 float [] marks1 = {10,20,30,40,40,50.5f,70};
	 String [] Student = {"Bhavesh","Ashutosh","Ravi"};
	 System.out.println(marks1.length);
	 System.out.println(marks1[5]);
	 System.out.println(Student[0]);
	 System.out.println(Student.length);
	 
	 // Simple way to display
	 System.out.println("\n Using nive way.");
	 System.out.println(marks[0]);
	 System.out.println(marks[1]);
	 System.out.println(marks[2]);
	 System.out.println(marks[3]);
	 System.out.println(marks[4]);
	 
	 // Display Through For loop (Recommended)
	 System.out.println("\n for loop");
	 for(int i = 0;i<marks.length;i++) {
		 System.out.println(marks[i]);
	 }
	 
	// Display Array reverse For loop
	 System.out.println("\n for loop Reverse order");
	 for(int i =marks.length-1;i>=0;i--) {
		 System.out.println(marks[i]);
	 }
	 
	 // For Each loop
	 System.out.println("\n for each  element  order");
	 for (int element: marks ) {
		 System.out.println(element);
	 }
}
	
}
