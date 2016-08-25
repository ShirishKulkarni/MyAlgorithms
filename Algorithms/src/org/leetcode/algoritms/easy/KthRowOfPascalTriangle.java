package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthRowOfPascalTriangle {

	public static void main(String[] args) {
		System.out.println(getRow(2));
	}

	public static List<Integer> getRow(int rowIndex) {
		
		
	

        Integer[] rowList = new Integer[rowIndex+1];
        rowList[0] = 1;
        for(int i=1; i<rowList.length;i++) {
            rowList[i] = (int)((long)rowList[i-1]*(rowIndex-(i-1))/(i));
        }
        return Arrays.asList(rowList);
    
	}
}
