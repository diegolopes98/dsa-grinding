package com.diegolopes98.dsa.leetcode.Array.RemoveElement;

public class RemoveElementImpl implements RemoveElement {
    @Override
    public Integer execute(RemoveElementInput input) {
        return removeElement(input.nums(), input.val());
    }

    private int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
