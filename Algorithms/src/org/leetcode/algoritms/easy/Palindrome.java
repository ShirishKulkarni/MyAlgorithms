package org.leetcode.algoritms.easy;

public class Palindrome {

	public static void main(String[] args) {
		isPalindrome(1212);

	}

	public static boolean isPalindrome(int x) {
		boolean flg = false;
		int temp=x;
		int b=0;
		while(temp>0){
			b=temp%10+b*10;
			
			temp=temp/10;
			
		}
	//	System.out.println(b);
		flg=b==x;
		return flg;
	}

}
