package org.leetcode.algoritms.easy;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(">>" + addDigits(9887));

	}

	public static int addDigits(int num) {
		// int sum=0
		if (num < 10) {
			return num;
		}else
		{
			return addDigits(num / 10+num % 10);
		}
		// return num;
	}
}
