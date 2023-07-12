package com.array.practice;

public class ArrayFrequency {
	//Program to find the frequency of each element in the array
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,2,2,3,4,5,1};
		int[] fre =new int[arr.length];
		int visited = -1;
		
		for (int i = 0;i<arr.length;i++) {
			int count = 1;
			for(int j= i+1;j<arr.length;j++)
			if(arr[i]==arr[j]) {
				System.out.println(i+" count : "+j);
				count=count+1;
				System.out.print("count : ");
				System.out.println(count);
				fre[j]=visited;
				System.out.println("fre[j] : ");
				System.out.println(fre[j]);
				System.out.println(" j :- ");
				System.out.println(j);
				System.out.println(" ");
			}
			if(fre[i] != visited)  
                fre[i] = count; 
			System.out.println(i+" = i ");
			System.out.print(" fre[i] : ");
			System.out.println(fre[i]);
			System.out.println(" ");
		 }  
		  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fre.length; i++){  
            if(fre[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fre[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  
