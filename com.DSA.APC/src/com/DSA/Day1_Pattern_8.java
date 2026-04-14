package com.DSA;

public class Day1_Pattern_8 {
	// for floyds triangle
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}

}
