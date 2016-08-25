package org.leetcode.algoritms.easy;

public class MoveZeros {

	public static void main(String[] args) {

		System.out.println("test");
		int[] nums = {1};//{ 0, 0,0,0, 4, 3, 12,0,7,57,0,87,98};
		System.out.print("Before::");
		print(nums);
		System.out.println();
		moveZeroes(nums);
		System.out.println();
		System.out.print(" After::");
		print(nums);
	}

	private static void print(int[] nums) {
		for (int p : nums) {
			System.out.print(p + ",");
		}

	}

	public static void moveZeroes(int[] nums) {
		int nbr;
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			nbr = nums[i];

			if (nbr != 0&&nums.length>1) {
				swap(pos, i, nums);
				pos++;
			}

		}

	}

	private static void swap(int pos, int i, int[] nums) {

		
		int temp = nums[pos];
		nums[pos] = nums[i];
		nums[i] = temp;

	}
}
