package org.leetcode.algoritms.easy;

public class PlusOne {
	
	public static void main(String[] args) {
		int[] arr={9,9,9};
		RemoveElement.print(arr);System.out.println();
		arr=plusOne(arr);
		RemoveElement.print(arr);
	}
	
	
    public static int[] plusOne(int[] digits) {
    	int len=digits.length;
    	for(int i=len-1;i>=0;i--){
    		if(digits[i]<9){
    			digits[i]+=1;
    			break;
    		}
    		else{
    			digits[i]=0;
    			if(i==0){
    				digits=new int[len+1];
    				digits[0]=1;
    			}
    		}
    	}
    	
    	
    	
    	return digits;
        
    }
}