package org.leetcode.algoritms.easy;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("abcb", "abbc"));

	}

	public static boolean isAnagram(String s, String t) {
		boolean flag = false;
		if (s.length() == t.length()) {

			char[] sArr = s.toCharArray();
			char[] tArr = t.toCharArray();
			
			int[] arr=new int[256];
			
			for(char p: sArr){
				
				arr[(int)p]++;
				
			}
			
			for(char p:tArr){
				if(arr[(int)p]>0){
					arr[(int)p]--;
				}
				else{
					return false;
				}
			}
			flag=true;
		}

		return flag;
	}

}
