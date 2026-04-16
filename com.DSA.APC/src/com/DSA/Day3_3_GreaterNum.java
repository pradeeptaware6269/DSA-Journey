package com.DSA;

public class Day3_3_GreaterNum {
	public String greater(int a, int b) {
		if (a > b) {
			return "a is greater than b";
		} else if (a == b) {
			return "a and b is greater";

		} else {
			return "b is greater than a";
		}

	}

	public static void main(String[] args) {
		Day3_3_GreaterNum d = new Day3_3_GreaterNum();
		System.out.println(d.greater(23, 10));
	}

}
