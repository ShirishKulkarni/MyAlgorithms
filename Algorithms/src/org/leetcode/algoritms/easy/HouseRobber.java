package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums={1,4,6,4,7,9,9,9,9,9,3};
		
		
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
			int money=0;
			int max=0;
			
			for(int i=0;i<nums.length;i++){
				max+=getNextMax(nums,max,i);
			}
			
			
			
			return money;
			
	}

	private static int getNextMax(int[] nums, int max, int j) {
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
				nums[i]=-1;
			}
		}
		
		
		return 0;
	}

}
