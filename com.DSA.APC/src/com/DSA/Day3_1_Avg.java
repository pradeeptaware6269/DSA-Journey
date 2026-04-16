package com.DSA;

public class Day3_1_Avg {
	public void average(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		System.out.println("The Average of the 3 Numbers is :" + avg);
	}

	public static void main(String[] args) {
		Day3_1_Avg d = new Day3_1_Avg();
		d.average(22, 230, 430);
	}

}
