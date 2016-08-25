package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseVovelsInString {

	public static void main(String[] args) {
		String x = "hello";
		System.out.println(x);
		System.out.println(reverseVowels(x));
	}

	public static String reverseVowels(String s) {

		if (s != null && s.length() != 0 && s.length() != 1) {
			List<Character> l = new ArrayList<Character>();
			for (Character p : s.toCharArray()) {
				if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u' || p == 'A' || p == 'E' || p == 'I'
						|| p == 'O' || p == 'U') {
					l.add(p);
				}
			}
			int len = l.size() - 1;
			char p = 'a';
			char[] temp = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				p = s.charAt(i);
				if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u' || p == 'A' || p == 'E' || p == 'I'
						|| p == 'O' || p == 'U') {
					temp[i] = l.get(len--);

				}
			}
			s = String.valueOf(temp);

		}

		return s;
	}

}
