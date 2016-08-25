package org.leetcode.algoritms.easy;

public class RemoveElement {

	public static void main(String[] args) {

		System.out.println("test");
		int[] nums = { 1 };
		System.out.print("Before::");
		print(nums);
		System.out.println();
		System.out.println(">>" + removeElement(nums, 1));
		System.out.println();

	}

	private static int removeElement(int[] nums, int val) {

		int nbr;
		int pos = 0;
		int count = 0;
		int len=nums.length;
		if (null != nums&&len>0) {

			 if (len == 1) {
				if (nums[0] == val) {
				
					nums[0] = nums[0] + 1;
				} else {
					count = 1;
				}

			} else {
				for (int i = 0; i < len; i++) {
					nbr = nums[i];
					if (nbr == val) {
						count++;
					}
					else {
						nums[pos++] = nums[i];
						//pos++;
					}

				}
				count=len-count;
			}
		}

		
		return count;

	}


	static void print(int[] nums) {
		if (nums != null)
			for (int p : nums) {
				System.out.print(p + ",");
			}

	}

}
