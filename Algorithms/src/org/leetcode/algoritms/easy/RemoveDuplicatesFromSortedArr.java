package org.leetcode.algoritms.easy;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArr {

	public static void main(String[] args) {
		int[] nums={1,1,2};
		removeDuplicates(nums);
		
		System.out.println(nums);

	}

	public static  int removeDuplicates(int[] nums) {
		
		 int cur = 0 ; 
		    for(int n:nums)
		        if(n>nums[cur])
		            nums[++cur] = n;
		    return cur+1;
		
	}
		private static void swap(int i, int j, int[] nums) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			
		}
		
		
		
		
		
		
		
		
		
	/*

		
		Set<Integer> set=new TreeSet<Integer>();
		for(int p:nums){
			set.add(p);
		}
		int i=0;
		for(int p:set){
			nums[i]=p;
			i++;
		}
		
		return set.size();
		
		
	}*/

	
}
