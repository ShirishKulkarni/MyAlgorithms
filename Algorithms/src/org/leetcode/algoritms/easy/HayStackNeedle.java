package org.leetcode.algoritms.easy;

public class HayStackNeedle {

	public static void main(String[] args) {
		int p=strStr("shirish","rit");
		System.out.println(p);
	}
	
	 public static int strStr(String haystack, String needle) {
	        int pos=-1;
	        char[] haystackArr=haystack.toCharArray();
	        char[] needleArr=needle.toCharArray();
	        
	        
	        for(int i=0;i<haystackArr.length;i++){
	        	
	        	//System.out.println(haystackArr[i]);
	        	pos=i;
	        	for(int j=0;j<needleArr.length;j++){
	        		
	        		if(haystackArr[i]!=needleArr[j]){
	        			break;
	        		}
	        		else{
	        			i++;
	        		}
	        		if(j==needleArr.length-1){
	        			return i;
	        		}
	        	}
	        	pos=-1;
	        	
	        }
	        
	        return pos;
	    }

}
