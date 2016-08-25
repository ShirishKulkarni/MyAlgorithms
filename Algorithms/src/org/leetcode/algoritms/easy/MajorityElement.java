package org.leetcode.algoritms.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = { 2,2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int nbr = 0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int len=nums.length;
		
		if(len==1){
			return nums[0];
		}
		for(Integer p:nums){
			if(map.get(p)==null){
				map.put(p, 1);
			}else{
				map.put(p, map.get(p)+1);
				if (p >=((len / 2)+1)) {
					nbr = p;
					
				}
			}
			
			
		}
		
		
		return nbr;

	}
}
