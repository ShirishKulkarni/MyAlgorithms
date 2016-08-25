package org.leetcode.algoritms.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {

		//System.out.println(wordPattern("abca", "dog cat cat dog"));
		System.out.println(wordPattern("", "dog"));

	}

	public static boolean wordPattern(String pattern, String str) {

		boolean flag = true;
		char[] patternArr = pattern.trim().toCharArray();
		String[] strArr = str.split(" ");
		Map<Character, String> map = new HashMap<Character, String>();

		if (patternArr.length == strArr.length) {
			int len = patternArr.length;
			for (int i = 0; i < len; i++) {
				Character key = patternArr[i];
				String value = strArr[i];

				if (map.get(key) == null&&!map.containsValue(value)) {
					map.put(key, value);
				} else {
					String temp = map.get(key);
					if (!value.equals(temp)) {
						flag = false;
						break;
					}

				}
			}

		} else {
			flag = false;
		}

		return flag;

	}

}
