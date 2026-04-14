package com.DSA;

public class Day1_Pattern_4 {
	public static void main(String[] args) {
		// for inverted half pyramid
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
