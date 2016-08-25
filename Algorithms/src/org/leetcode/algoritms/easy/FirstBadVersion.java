package org.leetcode.algoritms.easy;

public class FirstBadVersion {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));
	}

	/***
	 * 2126753390 versions 1702766719 is the first bad version.
	 * 
	 * @param n
	 * @return
	 */
	public static int firstBadVersion(int n) {
		// int ver=-1;
		int low = 1;
		int high = n;
		int mid = 0;
		boolean flg;
		if (isBadVersion(n) && !isBadVersion(n - 1)) {
			return n;
		}
		while (low<high) {
			mid = low + ((high - low) / 2);// (low + high) >>> 1;//(low+ high) /
											// 2;
			System.out.println(">>" + mid);
			flg = isBadVersion(mid);
			
			if (flg) {
				high = mid;
			} else {
				low = mid;
			}

		}
		return low;
	}

	private static boolean isBadVersion(int n) {
		if (n == 1702766719) {
			return true;
		} else {
			return false;
		}
	}

}
