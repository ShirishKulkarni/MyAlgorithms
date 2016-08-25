package org.leetcode.algoritms.easy;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 3);

	}

	public static void rotate(int[] nums, int k) {

		int len = nums.length;
		/*if (len <= 1) {
			return;
		} else if (len == 2) {
			int temp=nums[0];
			nums[0]=nums[1];
			nums[1]=temp;

		} else {
*/
			int[] temp = new int[len];
			int p = 0;
			for (int i = 0; i <len ; i++) {
				p = (i + k) % len;
				temp[p] = nums[i];
			}

			nums = temp;
	//	}

	}

	/*
	 * public static void rotate(int[] nums, int k) {
	 * 
	 * int temp = 0; while (k > 0) { temp = nums[nums.length - 1];
	 * 
	 * for (int i = nums.length - 1; i > 0; i--) {
	 * 
	 * nums[i] = nums[i - 1];
	 * 
	 * } nums[0] = temp; k--; } System.out.println(nums); }
	 */
}
