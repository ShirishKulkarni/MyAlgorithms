package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		generate(5);

	}

	public static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> pt=new ArrayList<List<Integer>>(numRows);
		
		List<Integer> curList=null;
		List<Integer> prevList=null;
		for(int i=1;i<=numRows;i++){
			curList=new ArrayList<Integer>();
			for(int j=1;j<=i;j++){
				if(j==1){
				curList.add(1);
				}
				else if(j==i){
					curList.add(1);
				}
				else{
					curList.add(prevList.get(j-1)+prevList.get(j-2));
				}
			}
			
			prevList=curList;
			pt.add(prevList);
			
		}
		
		
		return pt;

	}
}
