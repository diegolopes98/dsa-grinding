package com.diegolopes98.dsa.leetcode.Array.TwoSum;

public record TwoSumInput(int[] nums, int target) {
    static TwoSumInput with(int[] nums, int target) {
        return new TwoSumInput(nums, target);
    }
}
