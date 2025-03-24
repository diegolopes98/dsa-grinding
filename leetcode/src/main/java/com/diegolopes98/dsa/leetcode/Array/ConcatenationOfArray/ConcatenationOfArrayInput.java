package com.diegolopes98.dsa.leetcode.Array.ConcatenationOfArray;

public record ConcatenationOfArrayInput(int[] nums) {
    static ConcatenationOfArrayInput with(int[] nums) {
        return new ConcatenationOfArrayInput(nums);
    }
}
