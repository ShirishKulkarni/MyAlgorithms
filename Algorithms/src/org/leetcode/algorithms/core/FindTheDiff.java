package org.leetcode.algorithms.core;

public class FindTheDiff {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcde", "abcedf"));
	}

	public static char findTheDifference(String s, String t) {
		char p = 0;
		long sSum = 0;
		long tSum = 0;
		for (char x : s.toCharArray()) {
			sSum += (int) x;
		}

		for (char x : t.toCharArray()) {
			tSum += (int) x;
		}
		p = (char) (tSum - sSum);
		return p;

	}
}
