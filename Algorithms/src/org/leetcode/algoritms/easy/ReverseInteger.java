package org.leetcode.algoritms.easy;

public class ReverseInteger {

	public static void main(String[] args) {

		reverse(123);
	}

	public static int reverse(int x) {
		int revNbr=0;
		
		boolean isNeg=x<0;
		if(isNeg){
			x=x*-1;
		}
		int count=0;
		while(x!=0){
			System.out.println(x%10);
			x/=10;
			count++;
		}
		System.out.println(">"+count);
		
		
		if(isNeg){
			revNbr=revNbr*-1;
		}
		return revNbr;

	}

}
