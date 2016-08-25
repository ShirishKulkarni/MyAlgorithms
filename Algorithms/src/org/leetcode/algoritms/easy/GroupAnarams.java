package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.List;

public class GroupAnarams {

	public static void main(String[] args) {

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> grpList = new ArrayList<List<String>>();
		for (String p:strs){
			checkGroupList(p,grpList);
		}
		return grpList;
	}

	private static void checkGroupList(String p, List<List<String>> grpList) {
		List<Integer[]> maskList=new ArrayList<Integer[]>();
		if(grpList.size()==0){
			List<String> grp=new ArrayList<String>();
			grp.add(p);
			char[] pArr=p.toCharArray();
			Integer[] mask=new Integer[256];
			for(char x:pArr){
				mask[x]++;
			}
			maskList.add(mask);
		}
		else{
			
		}
	}

}
