package com.array.practice;

public class ArrarSum {
 public static void main(String[] args) {
	int [] add = {21,42,67,81,92,40,};
	int temp = 0;
	for(int i =0;i<add.length;i++) {
		temp = temp + add[i];
		System.out.println(temp);
	}
	System.out.println("\n" + temp);
}
}
