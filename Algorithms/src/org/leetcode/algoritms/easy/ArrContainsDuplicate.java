package org.leetcode.algoritms.easy;

import java.util.HashSet;
import java.util.Set;

public class ArrContainsDuplicate {

	public static void main(String[] args) {
		
		int[] arr={2,3,4,3};
		System.out.println(containsDuplicate(arr));
		
	}
	
	  public static boolean containsDuplicate(int[] nums) {
	        
	        /*if(null!=nums&&nums.length>0){
	        	int len=nums.length;
	        	for(int i=0;i<len;i++){
	        		for(int j=0;j<len;j++ ){
	        			
	        			if(i!=j&&nums[i]==nums[j]){
	        				return true;
	        			}
	        			
	        		}
	        	}
	        	
	        }*/
		  	boolean flag=false;
	        Set<Integer> set=new HashSet<Integer>();
	        
	        for(int p:nums){
	        	set.add(p);
	        }
	        if(set.size()==nums.length){
	        	return false;
	        }
	        
	        return true;
	    }

}
