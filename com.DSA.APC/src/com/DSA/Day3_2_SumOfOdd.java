package com.DSA;

public class Day3_2_SumOfOdd {
	public void sumOfOdd(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The Sum of Odd Number is :" + sum);
	}

	public static void main(String[] args) {
		Day3_2_SumOfOdd d = new Day3_2_SumOfOdd();
		d.sumOfOdd(50);
	}
}
