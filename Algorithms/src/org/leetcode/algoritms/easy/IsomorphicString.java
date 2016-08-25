package org.leetcode.algoritms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("bar", "foo"));

	}

	public static boolean isIsomorphic(String s, String t) {
		boolean flg = true;
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		Map<Character, Character> map = new HashMap<Character, Character>();
		Set<Character> commonSet = new HashSet<Character>();
		int len = sArr.length;

		for (int i = 0; i <= len - 1; i++) {

			Character sEle = sArr[i];
			Character tEle = tArr[i];
			
			
			
			
			if ((commonSet.contains(sEle)||commonSet.contains(tEle)) && sEle != tEle) {
				flg = false;
			} else {
				  if (map.get(sEle) == null&&!map.values().contains(tEle)) {
					map.put(sEle, tEle);
					if (sEle == tEle) {
						commonSet.add(tEle);
					}

				} else {
					if (tEle != map.get(sEle)) {
						flg = false;
						break;
					}
				}
			}
		}

		return flg;

	}

}
