package com.tanushree.practice.leetcode;

public class LeetCode {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int count = 0;
		int[] list = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			count=0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;

				}

			}
			list[i] = count;
		}

		return list;
	}

	public static void main(String[] args) {

		int[] nums = { 8, 1, 2, 2, 3 };
		int[] list;
		LeetCode obj = new LeetCode();
		list = obj.smallerNumbersThanCurrent(nums);
		for (int j = 0; j < nums.length; j++) {
		System.out.print(" " +list[j]);
	}

}
}
