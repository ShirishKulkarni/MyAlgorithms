package org.leetcode.algoritms.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		//System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println( isPalindrome(",; W;:GlG:;l ;,"));
	}

	public static boolean isPalindrome(String s) {
		boolean flg = true;
		char[] a = s.toLowerCase().toCharArray();
		int i = 0;
		int j = a.length - 1;
		int p, q;
		int count=0;
		if (a.length > 3) {
			while (i < j) {
				p = (int) a[i];
				q = (int) a[j];
				if (!isValidAlphaNumeric(p)) {
					i++;
					continue;
				}
				if (!isValidAlphaNumeric(q)) {
					j--;
					continue;
				}
				count++;
				if (a[i] == a[j]) {
					i++;
					j--;
					continue;

				} else {
					return false;/*
					if(count>3){
					return false;
					}else{
						i++;j--;
					}
				*/}
			}
		}else if(a.length==2){
			p = (int) a[0];
			q = (int) a[1];
			if(isValidAlphaNumeric(p)&&isValidAlphaNumeric(q)){
				if(a[0]!=a[1]){
					return false;
				}
				
			}
			
		}
		else if(a.length==3){
			p = (int) a[0];
			q = (int) a[2];
			if(isValidAlphaNumeric(p)&&isValidAlphaNumeric(q)){
				if(a[0]!=a[2]){
					return false;
				}
				
			}
			
		}
		
		return flg;

	}
	
	private static boolean isValidAlphaNumeric(int p){
		if((p > 96&& p < 123)||(p>47&&p<58)){
			return true;
		}
		return false;
	}

}
