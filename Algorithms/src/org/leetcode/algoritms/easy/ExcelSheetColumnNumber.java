package org.leetcode.algoritms.easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AAA"));
	}
	
	
	 public static int titleToNumber(String s) {
	        int nbr=0;
	        int pow=0;
	        char[] charArr=s.toCharArray();
	        
	        
	        for(int i=charArr.length;i>0;i--){
	        	nbr=nbr+(charArr[i-1]-64)*((int)Math.pow(26, pow));
	        	pow++;
	        }
	        
	        
	        return nbr;
	    }
}
