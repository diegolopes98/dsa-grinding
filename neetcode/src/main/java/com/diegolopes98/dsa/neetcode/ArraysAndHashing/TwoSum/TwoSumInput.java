package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TwoSum;

public record TwoSumInput(int[] nums, int target) {
    static TwoSumInput with(int[] nums, int target) {
        return new TwoSumInput(nums, target);
    }
}
