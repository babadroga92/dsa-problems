package com.dsa.dsa_problems;


import top150.MergeSortedArray;

public class DsaProblemsApplication {

	public static void main(String[] args) {
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int[] nums = new int[]{1,2,3,0,0,0};
		int[] nums2 = new int[]{2,5,6};
		mergeSortedArray.merge(nums, 3, nums2, 3);
		for(int num : nums){
			System.out.print(num + " ");
		}
	}

}
