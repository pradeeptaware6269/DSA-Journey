package com.DSA;

public class Day1_Pattern_5 {
	public static void main(String[] args) {
		// for inverted half pyramid rotated by 180 degree

		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int k = (n - i); k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
