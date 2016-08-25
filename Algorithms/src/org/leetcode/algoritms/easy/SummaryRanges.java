package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[]a={0,1,2,3,4,5,7,8,9,11,13,14};
		System.out.println(summaryRanges(a));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> l = new ArrayList<String>();
		int low = nums[0];
		String high = "";
		
		for(int i=0;i<nums.length-1;i++){
			
			if(nums[i+1]==nums[i]+1){
				high=nums[i+1]+"";
				continue;
			}
			if("".equals(high)){
				l.add(low+"");
			}else{
				l.add(low+"->"+high);
			}
			low=nums[i+1];
			
		}
		return l;
	}

}
