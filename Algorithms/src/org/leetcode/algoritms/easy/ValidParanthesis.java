package org.leetcode.algoritms.easy;

public class ValidParanthesis {

	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
	}

	public static boolean isValid(String s) {

		char[] arr = new char[s.length()];
		int top = -1;

		if (null != s && s.length() != 1) {

			for (char p : s.toCharArray()) {

				if (top == -1 || p == '(' || p == '{' || p == '[') {
					arr[++top] = p;
				} else {
					if ((arr[top] == '(' && p == ')') || (arr[top] == '{' && p == '}')
							|| (arr[top] == '[' && p == ']')) {
						arr[top--] = 0;

					} else {
						return false;
					}

				}

			}

			if (top == -1) {
				return true;
			}
		}

		return false;
	}
}
