package org.leetcode.algoritms.easy;

public class PowerOfThree {

	public static void main(String[] args) {

		System.out.println(isPowerOfThree(-27));
	}

	public static boolean isPowerOfThree(int n) {

		if (n == 0) {
			return false;
		} else if (n == 1) {
			return true;
		} else {
			while (n != 1) {
				if (n % 3 != 0) {
					return false;
				}
				n = n / 3;
			}
		}

		return true;
	}
}
