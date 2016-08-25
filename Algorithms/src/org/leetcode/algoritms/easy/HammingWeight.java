package org.leetcode.algoritms.easy;

public class HammingWeight {

	public static void main(String[] args) {
		
		Long p=new Long("2147483648");
		hammingWeight(p);
	}

	public static  int hammingWeight(Long n) {
		int count=0;
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
	
		while(n>0){
			if(n%2==1)
				count++;
			
			n=n/2;
		}
		//scount++;
		System.out.println(count);
		return count;
		
	}

	

}
