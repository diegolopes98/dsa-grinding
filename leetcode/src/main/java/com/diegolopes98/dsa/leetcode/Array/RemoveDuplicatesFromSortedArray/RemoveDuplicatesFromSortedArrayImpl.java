package com.diegolopes98.dsa.leetcode.Array.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayImpl implements RemoveDuplicatesFromSortedArray {
    @Override
    public Integer execute(RemoveDuplicatesFromSortedArrayInput input) {
        return removeDuplicates(input.nums());
    }

    private int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
