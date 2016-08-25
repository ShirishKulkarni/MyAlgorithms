package org.leetcode.algoritms.easy;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		System.out.println(compareVersion("0.0.1", "0.1"));
	}
	
	

	public static int compareVersion(String version1, String version2) {
		String[] v1Arr = version1.split("\\.");
		String[] v2Arr = version2.split("\\.");
		int len1 = v1Arr.length;
		int len2 = v2Arr.length;
		int i = 0;
		int p1,p2,p;
		while (len1 > 0 || len2 > 0) {
			 
			 p1=i<v1Arr.length?Integer.parseInt(v1Arr[i]):0;
			 p2=i<v2Arr.length?Integer.parseInt(v2Arr[i]):0;
			 p=p1-p2;
			 
			if (p > 0) {
				return 1;
			}
			if (p < 0) {
				return -1;
			}
			i++;
			len1--;
			len2--;
		}

		

		return 0;
	}

}
